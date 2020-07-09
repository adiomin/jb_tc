package ru.ururu.jb

import io.restassured.RestAssured
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = [JbcontestApplication::class])
class JbApplicationTests {

    @LocalServerPort
    private var port: Int? = null

    @Before
    fun setUp() {
        RestAssured.port = port!!
        RestAssured.config().logConfig.enableLoggingOfRequestAndResponseIfValidationFails()
    }

    @Test
    fun contextLoads() {
        RestAssured.`when`()
            .get("/")
            .then()
            .assertThat()
            .body(Matchers.equalTo("Hello World"))
    }

}

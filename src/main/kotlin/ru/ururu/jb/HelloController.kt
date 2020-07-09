package ru.ururu.jb

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [APPLICATION_JSON_VALUE])
class HelloController {

    @GetMapping
    fun helloWorld(): String = "Hello World"
}
package com.paullee714.springsecuritybasic.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }
}
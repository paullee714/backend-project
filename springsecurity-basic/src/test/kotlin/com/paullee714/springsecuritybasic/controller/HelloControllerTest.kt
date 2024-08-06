package com.paullee714.springsecuritybasic.controller

import io.kotest.core.spec.style.BehaviorSpec
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(HelloController::class)
class HelloControllerTest(
     private val mvc: MockMvc
) : BehaviorSpec() {

    init {
        Given("Hello Controller 호출") {
            When("GET /hello 호출") {
                Then("Hello World! 리턴") {
                    mvc.perform(get("/hello"))
                        .andExpect(status().isOk)
                        .andExpect(content().string("Hello World!"))
                }
            }
        }
    }

}
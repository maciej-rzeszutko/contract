package com.example.contract

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
open class FraudBase {

    @LocalServerPort
    private var serverPort: Int = 0

    @BeforeEach
    fun setup() {
        RestAssured.port = serverPort
    }

//    @TestConfiguration
//    internal class ControllerTestConfig {
//        @Bean
//        fun foo(): Foo = mockk()
//    }

}



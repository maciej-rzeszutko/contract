package com.example.contract

import com.example.contract.infrastructure.fraudcheck.rest.FraudController
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach

open class BaseTestClass {

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(FraudController())
    }

}



package com.example.contract.infrastructure.fraudcheck.rest

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class FraudController {

    @PutMapping(
        value = ["/fraudcheck"],
        consumes = [APPLICATION_JSON_VALUE],
        produces = [APPLICATION_JSON_VALUE]
    )
    fun check(@RequestBody loanRequest: LoanRequest): String = if (loanRequest.loanAmount > 10000) {
        "{fraudCheckStatus: FRAUD, rejection.reason: Amount too high}"
    } else {
        "{fraudCheckStatus: OK, acceptance.reason: Amount OK}"
    }

}
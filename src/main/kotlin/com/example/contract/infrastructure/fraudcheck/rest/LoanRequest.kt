package com.example.contract.infrastructure.fraudcheck.rest

import com.fasterxml.jackson.annotation.JsonProperty

data class LoanRequest(
    @JsonProperty("client.id")
    val clientId: String,
    val loanAmount: Long
)
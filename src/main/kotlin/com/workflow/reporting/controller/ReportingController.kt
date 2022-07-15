package com.workflow.reporting.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reports")
class ReportingController {

    @GetMapping
    fun test(): ResponseEntity<String> = ResponseEntity.ok("test")
}
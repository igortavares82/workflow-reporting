package com.workflow.reporting.controller

import com.workflow.reporting.extension.toResponse
import com.workflow.reporting.service.ICallFlowService
import com.workflow.reporting.viewmodel.response.CallFlowResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reports")
class ReportingController(
    private val callFlowService: ICallFlowService
) {

    @GetMapping
    fun getCallFlows(): ResponseEntity<List<CallFlowResponse>> {
        val model = callFlowService.get()
        return ResponseEntity.ok(model.map { it.toResponse() })
    }
}
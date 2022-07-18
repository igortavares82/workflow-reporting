package com.workflow.reporting.service

import com.workflow.reporting.model.CallFlow

interface ICallFlowService {
    fun get(): List<CallFlow>
    fun getByCallId(callId: String): CallFlow
    fun create(model: CallFlow)
}
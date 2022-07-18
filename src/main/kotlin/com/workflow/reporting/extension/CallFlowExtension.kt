package com.workflow.reporting.extension

import com.workflow.reporting.event.CallFlowEvent
import com.workflow.reporting.model.CallFlow
import com.workflow.reporting.viewmodel.response.CallFlowResponse

fun CallFlowEvent.toModel(): CallFlow = CallFlow(
    this.`object`.callId,
    this.`object`.startDate,
    this.`object`.endDate,
    this.`object`.costumerNumber,
    this.`object`.outcome)

fun CallFlow.toResponse(): CallFlowResponse = CallFlowResponse(
    this.callId,
    this.startDate,
    this.endDate,
    this.costumerNumber,
    this.outcome
)
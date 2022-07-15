package com.workflow.reporting.extension

import com.workflow.reporting.event.CallFlowEvent
import com.workflow.reporting.model.CallFlow

fun CallFlowEvent.toModel(): CallFlow = CallFlow(
    this.callId,
    this.startDate,
    this.endDate,
    this.costumerNumber,
    this.outcome)
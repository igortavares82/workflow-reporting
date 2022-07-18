package com.workflow.reporting.viewmodel.response

import java.time.Instant

data class CallFlowResponse(
    val callId: String,
    val startDate: Instant,
    val endDate: Instant?,
    val costumerNumber: String,
    val outcome: String?)
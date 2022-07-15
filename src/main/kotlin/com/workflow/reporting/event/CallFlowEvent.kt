package com.workflow.reporting.event

import java.time.Instant

data class CallFlowEvent(
    val callId: String,
    val startDate: Instant = Instant.now(),
    val endDate: Instant?,
    val costumerNumber: String,
    val outcome: String?
)
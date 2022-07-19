package com.workflow.reporting.viewmodel.response

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.Instant
import java.util.*

data class CallFlowResponse(
    val callId: String,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ")
    val startDate: Date,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ")
    val endDate: Date?,

    val costumerNumber: String,
    val outcome: String?)
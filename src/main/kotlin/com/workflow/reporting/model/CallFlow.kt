package com.workflow.reporting.model

import java.time.Instant
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class CallFlow (

    @Id
    val callId: String,
    val startDate: Instant = Instant.now(),
    val endDate: Instant?,
    val costumerNumber: String,
    val outcome: String?)
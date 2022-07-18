package com.workflow.reporting.model

import java.time.Instant
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "callflow")
data class CallFlow (

    @Id
    @Column(name = "callid")
    val callId: String,

    @Column(name = "startdate")
    val startDate: Instant,

    @Column(name = "enddate")
    val endDate: Instant?,

    @Column(name = "costumernumber")
    val costumerNumber: String,

    @Column(name = "outcome")
    val outcome: String?)
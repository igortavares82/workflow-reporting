package com.workflow.reporting.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "callflow")
data class CallFlow (

    @Id
    @Column(name = "callid")
    val callId: String,

    @Column(name = "startdate")
    val startDate: Date,

    @Column(name = "enddate")
    val endDate: Date?,

    @Column(name = "costumernumber")
    val costumerNumber: String,

    @Column(name = "outcome")
    val outcome: String?)
package com.workflow.reporting.event

import com.talkdesk.events.consumer.handler.EventName
import java.time.Instant
import java.util.Date

@EventName("call.flow")
data class CallFlowEvent(
    override var event: String,
    override val timestamp: Date,
    override val eventId: String,
    override val platformId: String,
    override val accountId: String,
    override val `object`: CallFlowEventObject
): Event<CallFlowEventObject>(event, timestamp, eventId, platformId, accountId, `object`)

data class CallFlowEventObject(
    val callId: String,
    val startDate: Date,
    val endDate: Date?,
    val costumerNumber: String,
    val outcome: String?
)
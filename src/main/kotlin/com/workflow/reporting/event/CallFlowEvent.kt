package com.workflow.reporting.event

import com.talkdesk.events.consumer.handler.EventName
import java.time.Instant

@EventName("call.flow")
data class CallFlowEvent(
    override var event: String,
    override val timestamp: Instant,
    override val eventId: String,
    override val platformId: String,
    override val accountId: String,
    override val `object`: CallFlowEventObject
): Event<CallFlowEventObject>(event, timestamp, eventId, platformId, accountId, `object`)

data class CallFlowEventObject(
    val callId: String,
    val startDate: Instant,
    val endDate: Instant?,
    val costumerNumber: String,
    val outcome: String?
)
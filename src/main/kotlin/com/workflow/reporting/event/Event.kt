package com.workflow.reporting.event

import java.time.Instant
import java.util.*

open class Event<TObject>(
    open var event: String,
    open val timestamp: Date,
    open val eventId: String,
    open val platformId: String,
    open val accountId: String,
    open val `object`: TObject
)
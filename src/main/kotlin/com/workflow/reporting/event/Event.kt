package com.workflow.reporting.event

import java.time.Instant

open class Event<TObject>(
    open var event: String,
    open val timestamp: Instant,
    open val eventId: String,
    open val platformId: String,
    open val accountId: String,
    open val `object`: TObject
)
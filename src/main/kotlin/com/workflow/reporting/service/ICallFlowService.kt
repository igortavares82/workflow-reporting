package com.workflow.reporting.service

import com.talkdesk.events.consumer.handler.EventHandler
import com.workflow.reporting.event.CallFlowEvent

interface ICallFlowService {
    fun get()

    fun onApplicationStarts()
}
package com.workflow.reporting.eventHandler

import com.talkdesk.events.consumer.handler.EventHandler
import com.workflow.reporting.event.CallFlowEvent

interface ICallFlowEventHandler {
    fun callFlowHandler(): EventHandler<CallFlowEvent>
}
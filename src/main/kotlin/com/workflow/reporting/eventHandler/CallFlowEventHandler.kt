package com.workflow.reporting.eventHandler

import com.talkdesk.events.consumer.handler.handlerFor
import com.workflow.reporting.event.CallFlowEvent
import com.workflow.reporting.extension.toModel
import com.workflow.reporting.repository.ICallFlowRepository
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class CallFlowEventHandler(
    private val callFlowRepository: ICallFlowRepository,
): ICallFlowEventHandler {

    @Bean
    override fun callFlowHandler() = handlerFor<CallFlowEvent> { event ->
        val model = event.toModel()
        callFlowRepository.save(model)
    }
}
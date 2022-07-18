package com.workflow.reporting.service

import com.workflow.reporting.configuration.RabbitMqConfig
import com.workflow.reporting.model.CallFlow
import com.workflow.reporting.repository.ICallFlowRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class CallFlowService(
    private val callFlowRepository: ICallFlowRepository
): ICallFlowService {

    override fun get(): List<CallFlow> = callFlowRepository.findAll().toList()

    override fun getByCallId(callId: String): CallFlow = callFlowRepository.getFirstByCallId(callId)

    override fun create(model: CallFlow) {
        callFlowRepository.save(model)
    }
}
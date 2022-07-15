package com.workflow.reporting.service

import com.workflow.reporting.configuration.RabbitMqConfig
import com.workflow.reporting.repository.ICallFlowRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class CallFlowService(
    private val callFlowRepository: ICallFlowRepository,
    private val rabbitMqConfig: RabbitMqConfig,
    @Value("rabbitmq.queues.reporting") val reportingQueueName: String
): ICallFlowService {

    override fun get() {
        TODO("Not yet implemented")
    }

    @EventListener(ApplicationReadyEvent::class)
    override fun onApplicationStarts() {
        val consumer = rabbitMqConfig.getReportingConsumer(reportingQueueName, listOf("call.reporting"))
        consumer.start()
    }
}
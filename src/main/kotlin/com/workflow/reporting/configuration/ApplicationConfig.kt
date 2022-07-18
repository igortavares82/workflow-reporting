package com.workflow.reporting.configuration

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class ApplicationConfig(
    val rabbitMqConfig: RabbitMqConfig
) {

    @EventListener(ApplicationReadyEvent::class)
    fun onApplicationStart() {
        val consumer = rabbitMqConfig.getReportingConsumer("call.reporting", listOf("reporting"))
        consumer.start()
    }
}
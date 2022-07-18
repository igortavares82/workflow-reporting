package com.workflow.reporting.configuration

import com.rabbitmq.client.ConnectionFactory
import com.talkdesk.events.common.QueueInitializer
import com.talkdesk.events.consumer.handler.EventHandler
import com.talkdesk.events.consumer.handler.HandlerDispatcher
import com.talkdesk.events.consumer.handler.handlerFor
import com.talkdesk.events.consumer.rabbitmq.RabbitMQConsumer
import org.aspectj.weaver.ast.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener

@Configuration
class RabbitMqConfig(
    @Value("\${rabbitmq.url}") val rabbitMqUrl: String,
    @Value("\${rabbitmq.username}") val rabbitMqUsername: String,
    @Value("\${rabbitmq.password}") val rabbitMqPassword: String,
    val handlers: List<EventHandler<*>>
) {

    fun getReportingConsumer(queueName: String, routingKeys: List<String>): RabbitMQConsumer {
        val connectionFactory = getConnectionFactory()
        val dispatcher = HandlerDispatcher(handlers)

        QueueInitializer.initializeQueue(connectionFactory, "talkdesk.events", queueName, routingKeys)

        return RabbitMQConsumer(connectionFactory, 255, queueName, dispatcher, null)
    }

    private fun getConnectionFactory(): ConnectionFactory {
         val connectionFactory = ConnectionFactory().apply {
             this.setUri(rabbitMqUrl)
             this.username = rabbitMqUsername
             this.password = rabbitMqPassword
             this.useNio()
         }

        return connectionFactory
    }
}
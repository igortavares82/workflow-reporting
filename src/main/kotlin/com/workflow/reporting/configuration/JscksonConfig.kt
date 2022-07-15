package com.workflow.reporting.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.SingletonSupport
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class JscksonConfig {

    @Bean
    @Primary
    fun objectMapper() = customJacksonObjectMapper().apply {
        findAndRegisterModules()
        propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
        setSerializationInclusion(JsonInclude.Include.NON_NULL)
        configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    }

    private fun customJacksonObjectMapper() = ObjectMapper().apply {
        registerModule(KotlinModule(singletonSupport = SingletonSupport.CANONICALIZE))
    }
}
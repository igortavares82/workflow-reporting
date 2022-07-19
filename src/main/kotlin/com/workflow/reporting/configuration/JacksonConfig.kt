package com.workflow.reporting.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import java.time.LocalDate

@Configuration
class JacksonConfig(
    val localDateSerializerConfig: LocalDateSerializerConfig
) {

    @Bean
    @Primary
    fun objectMapper() = ObjectMapper().apply {
        this.findAndRegisterModules().configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        registerKotlinModule()
    }

    private fun javaTimeConfiguration(): JavaTimeModule {
        val javaTimeModule = JavaTimeModule()
        javaTimeModule.addSerializer(LocalDate::class.java, localDateSerializerConfig)

        return javaTimeModule
    }
}
package com.workflow.reporting.configuration

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.workflow.reporting.constants.DateTimeFormatter
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class LocalDateSerializerConfig: JsonSerializer<LocalDate>() {
    override fun serialize(value: LocalDate?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        gen?.writeString(value?.format(DateTimeFormatter.formatter()))
    }
}
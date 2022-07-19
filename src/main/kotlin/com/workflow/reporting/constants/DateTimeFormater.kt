package com.workflow.reporting.constants

import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern

class DateTimeFormatter {
    companion object {
        fun formatter(): DateTimeFormatter? = ofPattern("yyyy-MM-dd")
    }
}
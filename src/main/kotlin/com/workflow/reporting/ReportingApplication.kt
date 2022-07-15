package com.workflow.reporting

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReportingApplication

fun main(args: Array<String>) {
	runApplication<ReportingApplication>(*args)
}

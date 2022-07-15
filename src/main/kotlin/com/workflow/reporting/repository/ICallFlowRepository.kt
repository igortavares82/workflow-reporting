package com.workflow.reporting.repository

import com.workflow.reporting.model.CallFlow
import org.springframework.data.repository.CrudRepository

interface ICallFlowRepository: CrudRepository<CallFlow, String> {
}
package com.workflow.reporting.repository

import com.workflow.reporting.model.CallFlow
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ICallFlowRepository: CrudRepository<CallFlow, String> {
    fun getFirstByCallId(callId: String): CallFlow
}
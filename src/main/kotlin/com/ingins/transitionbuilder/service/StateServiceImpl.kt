package com.ingins.transitionbuilder.service

import com.ingins.transitionbuilder.dto.StateDto
import com.ingins.transitionbuilder.entity.state.State
import com.ingins.transitionbuilder.mapper.StateMapper
import com.ingins.transitionbuilder.repository.state.StateRepository
import org.springframework.stereotype.Service

@Service
class StateServiceImpl(
    private val stateRepository: StateRepository,
    private val stateMapper: StateMapper
) : StateService {
    override fun createState(text: String): StateDto {
        return  stateRepository.save(State(text)).let(stateMapper::map)
    }
}
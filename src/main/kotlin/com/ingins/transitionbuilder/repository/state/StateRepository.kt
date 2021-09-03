package com.ingins.transitionbuilder.repository.state

import com.ingins.transitionbuilder.entity.state.State
import org.springframework.data.repository.PagingAndSortingRepository
import java.util.*

interface StateRepository: PagingAndSortingRepository<State,UUID> {
}
package com.ingins.transitionbuilder.mapper

import com.ingins.transitionbuilder.dto.StateDto
import com.ingins.transitionbuilder.entity.state.State
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface StateMapper {

    fun map(entity: State): StateDto
}
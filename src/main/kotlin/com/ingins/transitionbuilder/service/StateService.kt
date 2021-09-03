package com.ingins.transitionbuilder.service

import com.ingins.transitionbuilder.dto.StateDto

interface StateService {
    fun createState(text: String): StateDto
}
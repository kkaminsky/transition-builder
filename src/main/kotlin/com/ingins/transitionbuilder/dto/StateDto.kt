package com.ingins.transitionbuilder.dto

import java.time.Instant
import java.util.*

data class StateDto(
    val id: UUID,
    val text: String,
    val createTime: Instant,
    val updateTime: Instant
)
package com.ingins.transitionbuilder.controller

import com.ingins.transitionbuilder.dto.StateDto
import com.ingins.transitionbuilder.service.StateService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/state")
class StateController(
    private val stateService: StateService
) {

    @PostMapping("/create")
    fun createState(@RequestBody text: String): StateDto {
        return stateService.createState(text)
    }
}
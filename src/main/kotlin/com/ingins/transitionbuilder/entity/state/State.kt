package com.ingins.transitionbuilder.entity.state


import com.ingins.transitionbuilder.entity.BaseUUIDEntity
import javax.persistence.Access
import javax.persistence.AccessType
import javax.persistence.Entity


@Entity
@Access(value= AccessType.FIELD)
data class State(
    var text: String
) : BaseUUIDEntity()
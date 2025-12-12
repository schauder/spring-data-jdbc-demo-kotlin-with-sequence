package de.schauderhaft.kotlinsequence

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Sequence

data class Person(
    @Id
    @Sequence(sequence = "ENTITY_SEQUENCE")
    val id: Long?,
    val name: String
)
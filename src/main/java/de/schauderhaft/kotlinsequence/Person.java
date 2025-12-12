package de.schauderhaft.kotlinsequence;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Sequence;

record Person(
		@Id
		@Sequence(sequence = "ENTITY_SEQUENCE")
		Long id,
		String name) {
}

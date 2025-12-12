package de.schauderhaft.kotlinsequence;

import org.springframework.data.annotation.Id;

record Person(@Id Long id, String name) {
}

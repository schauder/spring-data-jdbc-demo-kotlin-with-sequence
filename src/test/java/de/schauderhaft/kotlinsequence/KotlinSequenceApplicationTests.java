package de.schauderhaft.kotlinsequence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class KotlinSequenceApplicationTests {

	@Autowired
	private PersonRepository persons;

	@Test
	void contextLoads() {
		Person saved = persons.save(new Person(null, "Jens"));
		Person reloaded = persons.findById(saved.id()).orElseThrow();

		assertThat(reloaded).isEqualTo(saved);

	}

}

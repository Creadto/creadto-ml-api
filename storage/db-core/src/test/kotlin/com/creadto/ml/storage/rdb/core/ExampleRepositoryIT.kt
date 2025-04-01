package com.creadto.ml.storage.rdb.core

import com.creadto.ml.storage.rdb.CoreDbContextTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleRepositoryIT(
    val exampleRepository: com.creadto.ml.storage.rdb.core.ExampleRepository,
) : com.creadto.ml.storage.rdb.CoreDbContextTest() {
    @Test
    fun testShouldBeSavedAndFound() {
        val saved = exampleRepository.save(com.creadto.ml.storage.rdb.core.ExampleEntity("SPRING_BOOT"))
        assertThat(saved.exampleColumn).isEqualTo("SPRING_BOOT")

        val found = exampleRepository.findById(saved.id).get()
        assertThat(found.exampleColumn).isEqualTo("SPRING_BOOT")
    }
}

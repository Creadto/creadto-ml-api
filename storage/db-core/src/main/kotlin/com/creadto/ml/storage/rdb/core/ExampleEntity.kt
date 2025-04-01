package com.creadto.ml.storage.rdb.core

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class ExampleEntity(
    @Column
    val exampleColumn: String,
) : com.creadto.ml.storage.rdb.core.BaseEntity()

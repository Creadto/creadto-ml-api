package com.creadto.ml.storage.rdb.core

import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository : JpaRepository<com.creadto.ml.storage.rdb.core.ExampleEntity, Long>

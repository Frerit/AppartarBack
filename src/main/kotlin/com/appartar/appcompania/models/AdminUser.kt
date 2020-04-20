package com.appartar.appcompania.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("adminuser")
data class AdminUser (
    @Id
    val id: String? = null,
    var email: String? = null,
    var password: String? = null
)
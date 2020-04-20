package com.appartar.appcompania.repository

import com.appartar.appcompania.models.AdminUser
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface AdminRepository : ReactiveMongoRepository<AdminUser, String> {

    @Query("{'email : ?0'}")
    fun deleteByEmail(email: String);

}
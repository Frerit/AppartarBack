package com.appartar.appcompania.services

import com.appartar.appcompania.models.AdminUser
import com.appartar.appcompania.repository.AdminRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class AdminService {

    lateinit var repository: AdminRepository

    fun loginbyPassword(): Flux<AdminUser> = repository.findAll()

    fun insertar(admin: AdminUser) = repository.save(admin)
}
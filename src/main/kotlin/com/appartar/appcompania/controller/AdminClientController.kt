package com.appartar.appcompania.controller

import com.appartar.appcompania.models.AdminUser
import com.appartar.appcompania.repository.AdminRepository
import com.appartar.appcompania.services.AdminService
import kotlinx.coroutines.coroutineScope
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.Disposable
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.concurrent.Flow

@RestController
class AdminClientController(private val repository: AdminRepository) {

    @GetMapping("/login")
    fun login(): Flux<AdminUser> = repository.findAll()

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(): Disposable {
        var admin = AdminUser()
        admin.email = "julian@gmail.com"
        admin.password = "123456789"
        return repository.save(admin).subscribe()
    }


    @PostMapping("/delete")
    fun deleteItem(@RequestBody user: AdminUser): Mono<Void> {
        return repository.delete(user)
    }

    @PostMapping("/update")
    fun update(@RequestBody user: AdminUser): Disposable {
        return repository.save(user).subscribe()
    }


}
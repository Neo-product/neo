package com.example.neo.controller

import com.example.neo.dto.CRUDDto
import com.example.neo.service.CRUDService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class CRUDController(
    private val crudService: CRUDService
) {

    // localhost:8080/test | POST
    @PostMapping("/test")
    fun test(){
        println("Test")
    }


    // localhost:8080/create | POST
    @PostMapping("/create")
    fun create(
        @RequestBody body: CRUDDto
    ){
        crudService.create(body)
    }


}
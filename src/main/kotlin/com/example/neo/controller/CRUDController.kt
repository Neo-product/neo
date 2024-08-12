package com.example.neo.controller

import com.example.neo.dto.CRUDDto
import com.example.neo.service.CRUDService
import org.springframework.web.bind.annotation.*


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

    @GetMapping("/read/all")
    fun readAll(): List<CRUDDto> {
        return crudService.readAll()
    }

    // localhost:8080/read/{id} = 1 or 2
    // localhost:8080/read/2
    @GetMapping("/read/{id}")
    fun readById(
        @PathVariable id: Long
    ): CRUDDto {
        return crudService.readById(id)
    }

    // localhost:8080/update
    @PatchMapping("/update")
    fun update(
        @RequestBody dto: CRUDDto
    ) {
        crudService.update(dto)
    }


}
package com.example.neo.service

import com.example.neo.dto.CRUDDto
import com.example.neo.entity.CRUDEntity
import com.example.neo.repository.CRUDRepository
import org.springframework.stereotype.Service

@Service
class CRUDService (
    private val crudRepository: CRUDRepository
){

    private fun toEntity(crudDto: CRUDDto): CRUDEntity{
        return CRUDEntity(
            title = crudDto.title,
            content = crudDto.content
        )
    }

    fun create(
        body: CRUDDto
    ){
        crudRepository.save(toEntity(body))
    }

}
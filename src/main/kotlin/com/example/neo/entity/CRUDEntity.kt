package com.example.neo.entity

import jakarta.persistence.*

@Entity
@Table(name = "crud")
class CRUDEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val content: String,

)
package com.gerardo.rubio.storeapi.products.domain.entities

import com.fasterxml.jackson.annotation.JsonBackReference
import com.gerardo.rubio.storeapi.clients.domain.entities.Client
import javax.persistence.*

@Entity
@Table(name = "products")
data class Product(
        @Id
        @GeneratedValue
        var id: Int?,
        var name: String?,
        var description: String?,
        var price: Double?,
        var image: String
)
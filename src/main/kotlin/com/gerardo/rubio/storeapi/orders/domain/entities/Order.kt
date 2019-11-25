package com.gerardo.rubio.storeapi.orders.domain.entities

import javax.persistence.*

@Entity
@Table(name = "orders")
data class Order(
        @Id
        @GeneratedValue
        var id: Int?,
        var quantity: Int?,
        var client_name: String?,
        var client_mail: String?
)
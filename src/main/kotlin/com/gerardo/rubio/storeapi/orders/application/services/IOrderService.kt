package com.gerardo.rubio.storeapi.orders.application.services

import com.gerardo.rubio.storeapi.orders.domain.entities.Order
import java.util.*

interface IOrderService {
    fun getOrders(): List<Order>
    fun getOrderByID(id: Int): Optional<Order>
    fun addOrder(order: Order): Order
}
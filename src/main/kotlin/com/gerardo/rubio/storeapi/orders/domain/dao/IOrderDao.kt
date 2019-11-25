package com.gerardo.rubio.storeapi.orders.domain.dao

import com.gerardo.rubio.storeapi.orders.domain.entities.Order
import org.springframework.data.repository.CrudRepository

interface IOrderDao : CrudRepository<Order, Int> {

}
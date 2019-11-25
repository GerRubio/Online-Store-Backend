package com.gerardo.rubio.storeapi.orders.application.services.implementation

import com.gerardo.rubio.storeapi.orders.application.services.IOrderService
import com.gerardo.rubio.storeapi.orders.domain.dao.IOrderDao
import com.gerardo.rubio.storeapi.orders.domain.entities.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class OrderServiceImpl : IOrderService {

    @Autowired
    private lateinit var orderDao: IOrderDao

    override fun getOrders(): List<Order> = orderDao.findAll() as List<Order>

    override fun getOrderByID(id: Int): Optional<Order> = orderDao.findById(id)

    override fun addOrder(order: Order): Order = orderDao.save(order)
}
package com.gerardo.rubio.storeapi.orders.infraestructure.controllers

import com.gerardo.rubio.storeapi.orders.application.services.IOrderService
import com.gerardo.rubio.storeapi.orders.domain.entities.Order
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("v1")
class OrderController {
    private var Logger = LogFactory.getLog("OrderController.class")

    @Autowired
    private lateinit var orderService: IOrderService

    @CrossOrigin(origins = ["http://localhost:3000"])
    @RequestMapping("orders", "GET", "application/json")
    fun getOrders(): ResponseEntity<List<Order>> = ResponseEntity(orderService.getOrders(), HttpStatus.OK)

    @GetMapping("/orders/{id}")
    fun getOrderByID(@PathVariable id: Int): ResponseEntity<Order> {
        val result: Optional<Order> = orderService.getOrderByID(id)

        return result.map { res -> ResponseEntity(res, HttpStatus.OK) }.orElse(ResponseEntity(HttpStatus.NO_CONTENT))
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/add-order", "POST", "application.json")
    fun addOrder(@RequestBody order: Order): ResponseEntity<Order> {
        Logger.warn("Entra en /add $order")

        val result: Order = orderService.addOrder(order)

        return ResponseEntity(result, HttpStatus.OK)
    }
}
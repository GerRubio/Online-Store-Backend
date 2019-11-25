package com.gerardo.rubio.storeapi.products.infraestructure.controllers

import com.gerardo.rubio.storeapi.products.domain.entities.Product
import com.gerardo.rubio.storeapi.products.application.services.IProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("v1")
class ProductController {
    @Autowired
    private lateinit var productService: IProductService

    @CrossOrigin(origins = ["http://localhost:3000"])
    @RequestMapping("products", "GET", "application/json")
    fun getProducts(): ResponseEntity<List<Product>> = ResponseEntity(productService.getProducts(), HttpStatus.OK)

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/product/{id}")
    fun getProductByID(@PathVariable id: Int): ResponseEntity<Product> {
        val result: Optional<Product> = productService.getProductByID(id)

        return result.map { res -> ResponseEntity(res, HttpStatus.OK) }.orElse(ResponseEntity(HttpStatus.NO_CONTENT))
    }
}
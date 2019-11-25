package com.gerardo.rubio.storeapi.products.application.services

import com.gerardo.rubio.storeapi.products.domain.entities.Product
import java.util.*

interface IProductService {
    fun getProducts(): List<Product>
    fun getProductByID(id: Int): Optional<Product>
}
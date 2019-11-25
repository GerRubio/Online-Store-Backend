package com.gerardo.rubio.storeapi.products.domain.dao

import com.gerardo.rubio.storeapi.products.domain.entities.Product
import org.springframework.data.repository.CrudRepository

interface IProductDao : CrudRepository<Product, Int> {

}
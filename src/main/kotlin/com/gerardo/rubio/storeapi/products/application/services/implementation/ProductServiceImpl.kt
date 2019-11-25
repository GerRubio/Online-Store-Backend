package com.gerardo.rubio.storeapi.products.application.services.implementation

import com.gerardo.rubio.storeapi.products.domain.dao.IProductDao
import com.gerardo.rubio.storeapi.products.domain.entities.Product
import com.gerardo.rubio.storeapi.products.application.services.IProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl : IProductService {

    @Autowired
    private lateinit var productDao: IProductDao

    override fun getProducts(): List<Product> = productDao.findAll() as List<Product>

    override fun getProductByID(id: Int): Optional<Product> = productDao.findById(id)
}
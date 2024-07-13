package com.bardolog.backend.cartapp.backendcartapp.services;

import com.bardolog.backend.cartapp.backendcartapp.models.entities.Product;
import java.util.List;

public interface ProductService {
    
    List<Product> findAll(); //metodo para listar todos los productos
}

package com.bardolog.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bardolog.backend.cartapp.backendcartapp.models.entities.Product;
import com.bardolog.backend.cartapp.backendcartapp.repositories.ProductRepository;


@Service //anotacion para indicar que es un servicio, se debe importar desde org.springframework.stereotype
public class ProductServiceImpl implements ProductService {

    @Autowired //anotacion para inyectar el repositorio, se debe importar desde org.springframework.beans.factory.annotation
    private ProductRepository repository; //atributo de tipo ProductRepository para poder usar los metodos de CRUD


    @Override
    @Transactional(readOnly = true) //anotacion para indicar que es de solo lectura, se debe importar desde org.springframework.transaction.annotation
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return (List<Product>) repository.findAll(); //metodo para listar todos los productos, se le hace un cast a List<Product> porque el metodo findAll() devuelve un Iterable<Product>
    }
    
    
}

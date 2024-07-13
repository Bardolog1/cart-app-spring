package com.bardolog.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bardolog.backend.cartapp.backendcartapp.models.entities.Product;
import com.bardolog.backend.cartapp.backendcartapp.services.ProductService;


@RestController //anotacion para indicar que es un controlador, se debe importar desde org.springframework.web.bind.annotation, es rest porque va a devolver un json
@RequestMapping("/api") //anotacion para indicar la ruta del controlador, se debe importar desde org.springframework.web.bind.annotation
@CrossOrigin(origins = {"http://localhost:5173"}) //anotacion para indicar que se puede acceder desde un origen especifico, se debe importar desde org.springframework.web.bind.annotation
public class ProductController {

    @Autowired //anotacion para inyectar el servicio, se debe importar desde org.springframework.beans.factory.annotation
    private ProductService service; //atributo de tipo ProductService para poder usar los metodos de CRUD
    

    @GetMapping("/products") //anotacion para indicar que es un metodo get, se debe importar desde org.springframework.web.bind.annotation
    public List<Product> list() {
        return (List<Product>) service.findAll(); //metodo para listar todos los productos, se le hace un cast a List<Product> porque el metodo findAll() devuelve un Iterable<Product>
    }
}

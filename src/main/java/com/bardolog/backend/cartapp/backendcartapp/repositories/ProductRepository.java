package com.bardolog.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.bardolog.backend.cartapp.backendcartapp.models.entities.Product;

//interfaz para el repositorio de productos, se extiende de CrudRepository para poder usar los metodos de CRUD, se debe importar desde org.springframework.data.repository.CrudRepository
//Debe implementar los metodos de CRUD para poder usarlos en el controlador
//debe importar la clase Product desde com.bardolog.backend.cartapp.backendcartapp.models.entities
//esto ya es un Bean, por lo que no es necesario anotarlo con @Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
  
    
    

}

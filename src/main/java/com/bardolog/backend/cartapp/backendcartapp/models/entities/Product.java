package com.bardolog.backend.cartapp.backendcartapp.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//clase POJO para el producto, POJO = Plain Old Java Object

@Entity //anotacion para indicar que es una entidad, es decir, una tabla de la base de datos, se debe importar desde jakarta.persistence
@Table(name = "products") //anotacion para indicar el nombre de la tabla en la base de datos, se debe importar desde jakarta.persistence
public class Product {

    //atributos de la clase
    
        @Id //anotacion para indicar que es la llave primaria de la tabla, se debe importar desde jakarta.persistence
        @GeneratedValue(strategy = GenerationType.IDENTITY) //anotacion para indicar que es autoincremental, se debe importar desde jakarta.persistence
        private Long id;
       
       @Column(name = "name") //anotacion para indicar el nombre de la columna en la base de datos, se debe importar desde jakarta.persistence, se puede omitir si el nombre de la columna es el mismo que el del atributo
       private String name;
        
       private String description;
        
        private Double price;


        //constructor vacio y constructor con todos los atributos
    
        public Product() {
        }
    
        public Product(Long id, String name, String description, Double price) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            
        }
        
        //getters y setters para acceder a los atributos de la clase
    
        public Long getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public String getDescription() {
            return description;
        }    
    
        public Double getPrice() {
            return price;
        }
    
       
        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        //metodo toString para imprimir los atributos de la clase
    
}

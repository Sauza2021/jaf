package com.informatorio.API.Controller;

import com.informatorio.API.entitys.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import scala.collection.immutable.List;

@RestController
@RequestMapping("/products")
public class ProducReset {
    
    // @GetMapping
    // public ResponseEntity<List<Product>> getProduct() {
        
    //     return ResponseEntity.ok();
    
    //    public ResponseEntity<Product> getProduct(){
      //  Product product = new Product();
        //product.setId(1);
     //   product.setName("producto 1");
      //  return ResponseEntity.ok(product);

      @GetMapping("/hello")
      public String hello(){
        return "Hola Mundo "+"Aguante Ucrania";
    }
}
    


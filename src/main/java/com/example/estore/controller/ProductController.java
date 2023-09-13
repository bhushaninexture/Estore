package com.example.estore.controller;

import com.example.estore.Exception.EstoreException;
import com.example.estore.model.Product;
import com.example.estore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;
    @GetMapping("/getAll")
    public @ResponseBody Iterable<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = this.productService.saveProduct(product);
        return ResponseEntity.ok().body(createdProduct);
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Product getProductById(@PathVariable("id") Integer id) {

       Product product = productService.getProductById(id);
        if(product==null) {
            throw new EstoreException("Product id "+id+" incorrect..");
        }
        return product;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductById(@PathVariable("id") Integer id){

        productService.deleteProduct(id);
    }


}

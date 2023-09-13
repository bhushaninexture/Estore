package com.example.estore.service;

import com.example.estore.model.Product;


public interface ProductService {
    public  Iterable<Product> getAllProduct();

   public  Product saveProduct(Product product);

   public Product getProductById(Integer id);

  public  void deleteProduct(Integer id);
}

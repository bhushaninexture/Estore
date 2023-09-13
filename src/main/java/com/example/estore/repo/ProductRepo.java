package com.example.estore.repo;

import com.example.estore.model.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    @Query(value = "select * from product where id = ?", nativeQuery = true)
    public  Product findByprId (Integer Id);


}

package com.example.estore.service;


import com.example.estore.model.Product;
import com.example.estore.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;
    @Override
    public Iterable<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(Integer Id) {

        return productRepo.findByprId(Id);// null
    }

    @Override
    public void deleteProduct(Integer Id) {

      productRepo.deleteById(Id);

    }
}

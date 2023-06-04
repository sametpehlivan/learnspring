package org.pehlivan.c7_transactionalPropagation.services;

import org.pehlivan.c7_transactionalPropagation.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Transactional
    public void addTenProduct(String name){
       for (int i = 0; i < 10; i++){
            productRepository.addProduct(name+" "+i);
       }
    }
}

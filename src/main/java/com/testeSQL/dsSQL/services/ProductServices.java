package com.testeSQL.dsSQL.services;

import com.testeSQL.dsSQL.dto.ProductDTO;
import com.testeSQL.dsSQL.entities.Product;
import com.testeSQL.dsSQL.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        //Optional<Product> result = repository.findById(id);
        Product product = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}

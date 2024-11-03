package com.testeSQL.dsSQL.controllers;

import com.testeSQL.dsSQL.dto.ProductDTO;
import com.testeSQL.dsSQL.entities.Product;
import com.testeSQL.dsSQL.repositories.ProductRepository;
import com.testeSQL.dsSQL.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductServices service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}

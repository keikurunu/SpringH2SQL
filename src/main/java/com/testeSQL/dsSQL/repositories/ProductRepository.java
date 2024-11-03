package com.testeSQL.dsSQL.repositories;

import com.testeSQL.dsSQL.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

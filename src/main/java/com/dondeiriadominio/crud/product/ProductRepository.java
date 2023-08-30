package com.dondeiriadominio.crud.product;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //@Query("SELECT * FROM Product p WHERE p.name= ?1")

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    void deleteById(Long id);
}
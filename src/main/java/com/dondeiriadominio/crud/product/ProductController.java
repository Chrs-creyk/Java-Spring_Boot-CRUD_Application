package com.dondeiriadominio.crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<Object> registrarProduct(@RequestBody Product product) {
        return this.productService.newProduct(product);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarProduct(@RequestBody Product product) {
        return this.productService.newProduct(product);
    }

    @DeleteMapping(path = "/{productId}")
    public ResponseEntity<Object> eliminar(@PathVariable("productId") Long id) {
        return this.productService.deleteProduct(id);
    }
}
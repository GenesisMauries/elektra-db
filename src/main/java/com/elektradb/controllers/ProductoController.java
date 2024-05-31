package com.elektradb.controllers;

import com.elektradb.models.Producto;
import com.elektradb.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

//    @GetMapping("/{id}")
//    public Producto getProductoById(@PathVariable Long id) {
//        return productoRepository.findById(id).orElse(null);
//    }
@GetMapping("/{id}")
public ResponseEntity<Producto> getProductoById(@PathVariable Long id) {
    Optional<Producto> productoOptional = productoRepository.findById(id);
    if (productoOptional.isPresent()) {
        return ResponseEntity.ok(productoOptional.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}


    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }
}

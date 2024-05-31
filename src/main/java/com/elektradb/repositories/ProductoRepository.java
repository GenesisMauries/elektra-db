package com.elektradb.repositories;

import com.elektradb.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findBySkuOrNombre(String sku, String nombre);
}
package com.elektradb.repositories;

import com.elektradb.models.Plazo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlazoRepository extends JpaRepository<Plazo, Long> {
    // No es necesario agregar métodos personalizados aquí
    // Spring Data JPA proporcionará automáticamente métodos como save(), findAll(), findById(), etc.
}
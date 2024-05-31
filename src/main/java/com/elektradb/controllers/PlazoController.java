package com.elektradb.controllers;

import com.elektradb.models.Plazo;
import com.elektradb.repositories.PlazoRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plazos")
public class PlazoController {

    private final PlazoRepository plazoRepository;

    public PlazoController(PlazoRepository plazoRepository) {
        this.plazoRepository = plazoRepository;
    }

    // Endpoint para crear un nuevo plazo
    @PostMapping("/crear")
    public ResponseEntity<String> crearPlazo(@RequestBody Plazo plazo) {
        plazoRepository.save(plazo); // Guardar el plazo en la base de datos
        return ResponseEntity.status(HttpStatus.CREATED).body("Plazo creado exitosamente");
    }

    // Endpoint para obtener todos los plazos
    @GetMapping("/todos")
    public ResponseEntity<List<Plazo>> obtenerTodosPlazos() {
        List<Plazo> plazos = plazoRepository.findAll(); // Obtener todos los plazos de la base de datos
        return ResponseEntity.ok(plazos);
    }
}

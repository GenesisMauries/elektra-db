package com.elektradb.controllers;

import com.elektradb.models.Plazo;
import com.elektradb.repositories.PlazoRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/plazos")
public class PlazoController {

    private final PlazoRepository plazoRepository;

    public PlazoController(PlazoRepository plazoRepository) {
        this.plazoRepository = plazoRepository;
    }

    // Endpoint para crear un nuevo plazo
//    @PostMapping("/crear")
//    public ResponseEntity<String> crearPlazo(@RequestBody Plazo plazo) {
//        plazoRepository.save(plazo); // Guardar el plazo en la base de datos
//        return ResponseEntity.status(HttpStatus.CREATED).body("Plazo creado exitosamente");
//    }
    @PostMapping("/crear")
    public ResponseEntity<Plazo> crearPlazo(@RequestBody Plazo plazo) {
        Plazo plazoCreado = plazoRepository.save(plazo); // Guardar el plazo en la base de datos
        return ResponseEntity.status(HttpStatus.CREATED).body(plazoCreado);
    }

    // Endpoint para obtener todos los plazos
    @GetMapping("/todos")
    public ResponseEntity<List<Plazo>> obtenerTodosPlazos() {
        List<Plazo> plazos = plazoRepository.findAll(); // Obtener todos los plazos de la base de datos
        return ResponseEntity.ok(plazos);
    }

//    @DeleteMapping("/eliminar/{id}")
//    public ResponseEntity<String> eliminarPlazo(@PathVariable Long id) {
//        if (!plazoRepository.existsById(id)) {
//            return ResponseEntity.notFound().build(); // Si no se encuentra el plazo, devolver 404
//        }
//
//        plazoRepository.deleteById(id); // Eliminar el plazo de la base de datos
//        return ResponseEntity.ok("Plazo eliminado correctamente");
//    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String, String>> eliminarPlazo(@PathVariable Long id) {
        if (!plazoRepository.existsById(id)) {
            return ResponseEntity.notFound().build(); // Si no se encuentra el plazo, devolver 404
        }

        plazoRepository.deleteById(id); // Eliminar el plazo de la base de datos

        Map<String, String> response = new HashMap<>();
        response.put("message", "Plazo eliminado correctamente");

        return ResponseEntity.ok(response);
    }

}

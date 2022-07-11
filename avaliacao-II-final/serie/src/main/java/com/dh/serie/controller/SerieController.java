package com.dh.serie.controller;

import com.dh.serie.model.Serie;
import com.dh.serie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Serie>> findByGenre(@PathVariable String genre) {
        List<Serie> series = serieService.findByGenre(genre);
        return ResponseEntity.ok(series);
    }

    @PostMapping
    public ResponseEntity<Serie> saveMovie(@RequestBody Serie serie) {
        return ResponseEntity.status(201).body(serieService.saveSerie(serie));
    }
}

package com.dh.movie.controller;

import com.dh.movie.model.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> findByGenre(@PathVariable String genre) {
        List<Movie> movies = movieService.findByGenre(genre);
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.status(201).body(movieService.saveMovie(movie));
    }
}

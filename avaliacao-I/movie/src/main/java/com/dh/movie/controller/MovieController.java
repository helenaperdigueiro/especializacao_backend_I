package com.dh.movie.controller;

import com.dh.movie.model.Movie;
import com.dh.movie.queue.MovieListener;
import com.dh.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
@RefreshScope
public class MovieController {

    @Autowired
    private MovieService movieService;

    private final MovieListener movieListener;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> findByGenre(@PathVariable String genre) {

        List<Movie> movies = movieListener.receiveMessage(genre);
        return ResponseEntity.ok(movies);
    }

    @PostMapping()
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieService.saveMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }

}

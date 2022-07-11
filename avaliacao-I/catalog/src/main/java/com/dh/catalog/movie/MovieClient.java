package com.dh.catalog.movie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "movie-service", url = "localhost:8087/movies")
public interface MovieClient {

    @GetMapping("/{genre}")
//    ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable(value = ))
}

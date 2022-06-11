package com.dh.catalog.controller;

import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/{genre}")
    public List<Object> findMovies(@PathVariable String genre) {
        return catalogService.getMovies(genre);
    }

}

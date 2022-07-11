package com.dh.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private MovieFeign movieFeign;

    @Autowired
    private SerieFeign serieFeign;

    @Override
    public List<Object> getGenres(String genre) {
        List<Object> genres = new ArrayList<>();
        genres.add(movieFeign.findMovies(genre));
        genres.add(serieFeign.findSeries(genre));
        return genres;
    }
}

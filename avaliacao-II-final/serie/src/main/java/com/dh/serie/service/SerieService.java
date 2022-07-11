package com.dh.serie.service;

import com.dh.serie.model.Serie;

import java.util.List;

public interface SerieService {

    List<Serie> findByGenre(String genre);
    Serie saveSerie(Serie serie);
}

package com.dh.serie.service;

import com.dh.serie.model.Serie;
import com.dh.serie.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService{

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public List<Serie> findByGenre(String genre) {
        return serieRepository.findByGenre(genre);
    }

    @Override
    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }
}

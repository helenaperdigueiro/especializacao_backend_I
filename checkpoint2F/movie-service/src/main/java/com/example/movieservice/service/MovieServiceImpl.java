package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}

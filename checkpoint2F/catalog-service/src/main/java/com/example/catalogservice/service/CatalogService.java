package com.example.catalogservice.service;

import java.util.List;

public interface CatalogService {

    List<Object> getMovies(String genre);
}

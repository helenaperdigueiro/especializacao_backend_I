package com.dh.serie.repository;

import com.dh.serie.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, String> {
    List<Serie> findByGenre(String genre);
}

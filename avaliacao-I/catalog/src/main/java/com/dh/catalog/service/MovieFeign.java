package com.dh.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@FeignClient(value = "MOVIE")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/movies/{genre}")
    List<Object> findMovies(@PathVariable String genre);

}

//@FeignClient(value = "MUSICA")
//public interface MusicaFeign {
//    @RequestMapping(method = RequestMethod.GET, value = "/musica/{genero}")
//    String findMusica(@PathVariable String genero);
//}
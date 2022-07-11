package com.dh.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "SERIE")
public interface SerieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/series/{genre}")
    List<Object> findSeries(@PathVariable String genre);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.platzi.platzi_play.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.platzi.platzi_play.persistence.crud.CrudMovieEntity;
import com.platzi.platzi_play.persistence.entity.MovieEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.platzi.platzi_play.domain.dto.MovieDto;
import com.platzi.platzi_play.domain.service.MovieService;


/**
 *
 * @author axel
 */
@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }
}

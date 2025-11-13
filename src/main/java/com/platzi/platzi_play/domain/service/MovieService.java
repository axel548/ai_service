/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.platzi.platzi_play.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.platzi.platzi_play.domain.dto.MovieDto;
import com.platzi.platzi_play.domain.repository.MovieRepository;

/**
 *
 * @author axel
 */

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll() {
        return this.movieRepository.getAll();
    }
}

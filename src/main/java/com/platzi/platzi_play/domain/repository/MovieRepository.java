/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.platzi.platzi_play.domain.repository;

import java.util.List;

import com.platzi.platzi_play.domain.dto.MovieDto;

/**
 *
 * @author axel
 */
public interface MovieRepository {
    List<MovieDto> getAll();
}

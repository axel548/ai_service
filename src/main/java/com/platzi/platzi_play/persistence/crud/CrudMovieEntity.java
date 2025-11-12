/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.platzi.platzi_play.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.platzi_play.persistence.entity.MovieEntity;

import jakarta.persistence.Id;

/**
 *
 * @author axel
 */
public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

}

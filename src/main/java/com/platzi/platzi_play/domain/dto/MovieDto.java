/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.platzi.platzi_play.domain.dto;

import java.time.LocalDate;

/**
 *
 * @author axel
 */
public record MovieDto(
    String title,
    Integer duration,
    String genre,
    LocalDate releasDate,
    Double rating
) {

}

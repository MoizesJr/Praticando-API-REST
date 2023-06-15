package com.praticandoapi.Praticando.dto;

import com.praticandoapi.Praticando.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GameMinDTO {

  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  // instanciando as informações do game entity para o DTO
  public GameMinDTO(Game entity) {

    id = entity.getId();
    title = entity.getTitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    shortDescription = entity.getShortDescription();
  }

}

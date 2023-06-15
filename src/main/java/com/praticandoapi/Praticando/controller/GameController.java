package com.praticandoapi.Praticando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praticandoapi.Praticando.dto.GameMinDTO;
import com.praticandoapi.Praticando.services.GameService;

@RestController // responsavel por criar API que controla e chama API "JSON"
@RequestMapping(value = "/games") // confirguração de resposta na API
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping // aqui ele busca os objs
  // chama o metodo
  public List<GameMinDTO> findall() {
    List<GameMinDTO> result = gameService.findAll();
    return result;
  }
}

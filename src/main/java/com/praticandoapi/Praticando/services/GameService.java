package com.praticandoapi.Praticando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praticandoapi.Praticando.dto.GameMinDTO;
import com.praticandoapi.Praticando.entities.Game;
import com.praticandoapi.Praticando.repositories.GameRepository;

@Service // registra o GameService, injeta e cria uma logica de negocio (compra, baixa no
         // estoque e etc...)
public class GameService {

  @Autowired // usado para injetar um componete
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
  }
}

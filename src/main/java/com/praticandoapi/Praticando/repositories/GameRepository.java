package com.praticandoapi.Praticando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticandoapi.Praticando.entities.Game;

// repositoy ele faz a consulta BD, atualiza e deleta por meio do JPA
public interface GameRepository extends JpaRepository<Game/* nome da classe */, Long /* TIPO DO ID da classe */> {

}

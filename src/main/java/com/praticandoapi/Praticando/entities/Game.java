package com.praticandoapi.Praticando.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity // configuração da classe no BD
@Table(name = "tb_game") // nome da tabela no BD
public class Game {

  @Id // ID indica a chave primaria do BD
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementação do ID no BD
  private Long id;
  private String title;

  @Column(name = "game_year") // alteração do nome year para game_year no BD
  private Integer year; // year é uma palavra reservada do SQL e pode dá conflito no BD
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;

  @Column(columnDefinition = "TEXT") // anotação utilizada quando se tem mais de 255 caracte..
  private String shortDescription;

  @Column(columnDefinition = "TEXT")
  private String longDescription;

  // Com Override ele consegue comparar se os itens da mesma lista são iguais ou
  // um objeto com o outro
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Game other = (Game) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  private LocalDate date;

  @Override
  public double calcularXP() {
    return XP_PADRAO + 20d;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + date + "]";
  }
}

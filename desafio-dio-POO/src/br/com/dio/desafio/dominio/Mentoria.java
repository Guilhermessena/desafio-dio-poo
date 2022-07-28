package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	// Atributos
	private LocalDate data;

	// Métodos - Herdado da classe Mae (Conteudo)
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	// Getters and Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// toString
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + "," + " descricao=" + getDescricao() + "," + " data=" + data + "]";
	}

}

package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	// Atributos
	protected static final double XP_PADRAO = 10d;

	private String titulo;
	private String descricao;

	// Métodos
	public abstract double calcularXp();

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

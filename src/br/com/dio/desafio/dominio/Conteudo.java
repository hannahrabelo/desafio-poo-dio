package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String Titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

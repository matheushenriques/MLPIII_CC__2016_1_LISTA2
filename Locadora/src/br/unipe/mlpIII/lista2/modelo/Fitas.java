package br.unipe.mlpIII.lista2.modelo;

public class Fitas {
	private String autor;
	private String titulo;
	private double preco;
	private String categoria;

	public Fitas() {

	}

	public Fitas(String titulo, double preco, String categoria) {
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}

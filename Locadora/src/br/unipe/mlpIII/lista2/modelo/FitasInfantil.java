package br.unipe.mlpIII.lista2.modelo;

public class FitasInfantil extends Fitas {
	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco - (preco * 0.4) ;
		return;

	}

}

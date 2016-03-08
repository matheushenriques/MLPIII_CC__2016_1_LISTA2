package br.unipe.mlpIII.lista2.modelo;

public class FitasLancamento extends Fitas {
	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = (preco*0.2) + preco;
		return;
		
	}
	
	

}

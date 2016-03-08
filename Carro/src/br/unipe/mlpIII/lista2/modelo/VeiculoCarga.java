package br.unipe.mlpIII.lista2.modelo;

public class VeiculoCarga extends Veiculo{
	
	private double carga;
	
	public VeiculoCarga(){
		
	}

	public double getCarga() {
		System.out.println("Possivel levar um quantidade de: "+ carga + "quilos");
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

}

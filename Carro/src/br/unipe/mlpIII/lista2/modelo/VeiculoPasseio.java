package br.unipe.mlpIII.lista2.modelo;

public class VeiculoPasseio extends Veiculo {

	private int qtdPortas;
	private boolean ar;
	
	public VeiculoPasseio(){
		
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
		System.out.println("Quantidade de portas: " + qtdPortas);
	}

	public boolean isAr() {
		if(ar == true){
			System.out.println("Possui Ar");
		}else System.out.println("Não possui ar");
		return ar;
	}

	public void setAr(boolean ar) {
		this.ar = ar;
	}

}

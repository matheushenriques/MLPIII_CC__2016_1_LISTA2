package br.unipe.mlpIII.lista2.modelo;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data() {

	}

	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		if ((dia > 31) || (dia<1) || (mes > 12) || (mes <=0) || (ano < 1)) {
			System.out.println("Data invalida");
		}
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}

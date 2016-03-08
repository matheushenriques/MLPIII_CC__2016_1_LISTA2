package br.unipe.mlpIII.lista2.modelo;

public class Veiculo{
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private int valorKmRodado;
	private int kmInicial;
	private int kmFinal;
	private double valorLocacao;
	private String chassi;
	private String proprietario;

	public Veiculo(){
		
	}
	
	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(int valorKmRodado) {
		this.valorKmRodado = kmInicial + kmFinal;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public int setValorLocacao(){
		this.valorLocacao = (getKmInicial() - getKmFinal()) * getValorKmRodado();
		return (int) valorLocacao;
		
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	

}

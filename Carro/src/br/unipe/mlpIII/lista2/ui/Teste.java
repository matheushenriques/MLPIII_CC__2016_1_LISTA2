package br.unipe.mlpIII.lista2.ui;

import java.util.Scanner;

import br.unipe.mlpIII.lista2.modelo.Pessoa;
import br.unipe.mlpIII.lista2.modelo.Veiculo;
import br.unipe.mlpIII.lista2.modelo.VeiculoCarga;
import br.unipe.mlpIII.lista2.modelo.VeiculoPasseio;

public class Teste {

	public static void main(String[] args) {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Veiculo c = new Veiculo();
		Pessoa p = new Pessoa();
		System.out.println("Informe o nome do Proprietaro: ");
		c.setProprietario(scan.nextLine());
		p.setNome(c.getProprietario());
		System.out.println("Carro de Passeio - [1]");
		System.out.println("Carro de Carga - [2]");
		opcao = scan.nextInt();
		if (opcao == 1) {
			VeiculoPasseio vp = new VeiculoPasseio();
			System.out.println("Informe a placa: ");
			vp.setPlaca(scan.nextLine());
			System.out.println("Informe a marca: ");
			vp.setMarca(scan.nextLine());
			System.out.println("Informe o modelo: ");
			vp.setPlaca(scan.nextLine());
			System.out.println("Informe o ano: ");
			vp.setAno(scan.nextInt());
			System.out.println("Informe o km incial: ");
			vp.setKmInicial(scan.nextInt());
			System.out.println("Informe o km final: ");
			vp.setKmFinal(scan.nextInt());
			System.out.println("Informe o chassi: ");
			vp.setChassi(scan.nextLine());
			vp.setAr(true);
			vp.setQtdPortas(4);
			System.out.println("Valor de Locação: "+ vp.setValorLocacao());
		}
		
		if( opcao == 2){
			VeiculoCarga vc = new VeiculoCarga();
			System.out.println("Informe a placa: ");
			vc.setPlaca(scan.nextLine());
			System.out.println("Informe a marca: ");
			vc.setMarca(scan.nextLine());
			System.out.println("Informe o modelo: ");
			vc.setPlaca(scan.nextLine());
			System.out.println("Informe o ano: ");
			vc.setAno(scan.nextInt());
			System.out.println("Informe o km incial: ");
			vc.setKmInicial(scan.nextInt());
			System.out.println("Informe o km final: ");
			vc.setKmFinal(scan.nextInt());
			System.out.println("Informe o chassi: ");
			vc.setChassi(scan.nextLine());
			vc.setCarga(30);
			System.out.println("Valor de Locação: "+ vc.setValorLocacao());
			
		}

		scan.close();
	}

}

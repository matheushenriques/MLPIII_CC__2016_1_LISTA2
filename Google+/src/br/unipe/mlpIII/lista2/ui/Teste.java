package br.unipe.mlpIII.lista2.ui;

import java.util.Scanner;

import br.unipe.mlpIII.lista2.modelo.Data;

public class Teste {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Data d = new Data();
		System.out.println("Informe a data: ");
		d.setData(scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(d.toString());
		System.out.println(d.toString());
		scan.close();
	}

}

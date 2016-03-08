package br.unipe.mlpIII.lista2.ui;

import java.util.Scanner;

import br.unipe.mlpIII.lista2.modelo.Fitas;
import br.unipe.mlpIII.lista2.modelo.FitasInfantil;
import br.unipe.mlpIII.lista2.modelo.FitasLancamento;
import br.unipe.mlpIII.lista2.modelo.Autor;
import br.unipe.mlpIII.lista2.modelo.Categoria;

public class Teste {

	private static int i;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Categoria c = new Categoria();
		Fitas f = new Fitas();
		Autor a = new Autor();
		System.out.println("Informe o nome do Autor: ");
		a.setNome(scan.nextLine());
		f.setAutor(a.getNome());
		System.out.println("Informe o titulo: ");
		f.setTitulo(scan.nextLine());
		System.out.println("Informe o preço: ");
		f.setPreco(scan.nextDouble());
		System.out.println("Informe a categoria:ACAO - [1] AVENTURA - [2] COMEDIA - [3] ROMANCE -[4] ");
		c.escolheCategoria(scan.nextInt());
		System.out.println("Lançamento - [1] ");
		System.out.println("Infantil   - [2] ");
		i = scan.nextInt();
		if (i == 1) {
			FitasLancamento fl = new FitasLancamento();
			fl.setPreco(f.getPreco());
			System.out.println("O valor é: R$" + fl.getPreco());
		} else if (i == 2) {
			FitasInfantil fi = new FitasInfantil();
			fi.setPreco(f.getPreco());
			System.out.println("O valor é: R$" + fi.getPreco());
		}

		scan.close();

	}

}

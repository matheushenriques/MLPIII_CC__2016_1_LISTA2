package br.unipe.mlpIII.lista2.modelo;

public class Categoria {
	
	private static final int ACAO = 1;
	private static final int AVENTURA = 2;
	private static final int COMEDIA = 3;
	private static final int ROMANCE = 4;

	public enum escolhaCategoria {
		 ACAO(1), AVENTURA(2),COMEDIA(3), ROMANCE(4);
		private final int valor;

		escolhaCategoria(int valor) {
			this.valor = valor;
		}

	
		public int getValor() {
			return valor;
		}
	}

	public void escolheCategoria(int opcao) {
		if (opcao == Categoria.ACAO) {
			System.out.println("Ação!");
		} else if (opcao == Categoria.AVENTURA) {
			System.out.println("Aventura!");
		} else if (opcao == Categoria.COMEDIA) {
			System.out.println("Comedia!");
		} else if (opcao == Categoria.ROMANCE) {
			System.out.println("Romance!");
		}

	}

}

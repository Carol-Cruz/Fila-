package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		String nome, clienteRemovido;
		Queue<String> fila = new LinkedList<String>();
		Scanner capta = new Scanner(System.in);

		do {
			System.out.println("*********************************************************");
			System.out.println(" 1 - Adicionar cliente na Fila");
			System.out.println(" 2 - Listar todos os Clientes");
			System.out.println(" 3 - Retirar Cliente da Fila ");
			System.out.println(" 0 - Sair");
			System.out.println("*********************************************************");
			System.out.println("Entre com a opção desejada:");
			opcao = capta.nextInt();

			switch (opcao) {

			case 0:

				System.out.println("Programa encerrado!");
				break;

			case 1:

				System.out.println("Digite o nome: ");
				nome = capta.next();
				fila.add(nome);
				System.out.println("Cliente adicionado! " + "Fila: " + fila);
				break;

			case 2:

				for (String mostra : fila)
					System.out.println("Lista de clientes na fila: " + mostra);
				break;

			case 3:

				if (fila.isEmpty() == true) {
					System.out.println("A Fila está vazia!");
				} else if (fila.isEmpty() == false) {
					clienteRemovido = fila.poll();
					System.out.println("Fila: " + fila);
					System.out.println("O cliente foi chamado! Cliente: " + clienteRemovido);
					break;

					
				}

			}

		} while (opcao != 0);

	}

}

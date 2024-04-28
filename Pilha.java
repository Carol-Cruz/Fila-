package fila;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcao;
		String nome, livroRemovido;
		Stack<String> pilha = new Stack<String>();
		
		Scanner capta = new Scanner(System.in);
		do {
			System.out.println("*********************************************************");
			System.out.println(" 1 - Adicionar livro na pilha");
			System.out.println(" 2 - Listar todos os livros");
			System.out.println(" 3 - Retirar livro da pilha ");
			System.out.println(" 0 - Sair");
			System.out.println("*********************************************************");
			System.out.println("Entre com a opção desejada:");
			opcao = capta.nextInt();

			switch (opcao) {

			case 0:

				System.out.println("Programa encerrado!");
				break;

			case 1:

				System.out.println("Digite o nome do livro: ");
				nome = capta.next();
				pilha.add(nome);
				System.out.println("Livro adicionado! " + "Pilha: " + pilha);
				break;

			case 2:

				for (String mostra : pilha)
					System.out.println("Lista todos os livros: " + mostra);
				break;

			case 3:

				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia!");
				} else if (pilha.isEmpty() == false) {
					livroRemovido = pilha.pop();
					System.out.println("Pilha: " + pilha);
					System.out.println(" Um livro foi retirado da pilha! Livro: " + livroRemovido);
					break;

					
				}

			}

		} while (opcao != 0);

	}

}


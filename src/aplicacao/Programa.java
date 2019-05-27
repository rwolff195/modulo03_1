package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um produto em estoque (nome,
		quantidade no estoque). Em seguida:
		Mostrar os dados do produto (nome, preço, quantidade no estoque, valor
		estoque)
		Realizar uma entrada no estoque e mostrar novamente os dados do produt
		Realizar uma saída no estoque e mostrar novamente os dados do produto 
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do Produto: ");
		System.out.print("Nome Produto: ");
		produto.nome = sc.nextLine();
		System.out.print("Valor do Produto: ");
		produto.preco =sc.nextDouble();
		System.out.print("Qauntidade de Produto: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.println("Adicione o numero de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do Produto: " + produto);
		
		System.out.println();
		System.out.println("Adicione o numero de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removeQuantidade(quantidade);
		
		System.out.println();
		System.out.println("Atualização do Produto: " + produto);
		

	}

}

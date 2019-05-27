package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//Cria um padr�o para impress�o de impress�o para o objeto Produto
	
	public String toString() {
		return nome
			 + ", Valor R$ "
			 + String.format("%.2f", preco) // faz a fun��o do pritf - formata a saida do valor
			 + ", "
			 + quantidade
			 + " unidades, Total em estoque R$ "
			 + String.format("%.2f", totalValorEmEstoque());
	}
	
}//fim class

package streams;

public class Produtos {
	final String nome;
	final double valor;
	final double frete;
	final double desconto;

	public Produtos(String nome, double valor, double frete, double desconto) {
		this.nome = nome;
		this.valor = valor;
		this.frete = frete;
		this.desconto = (desconto * this.valor) / 100;
	}

}

package lambdas;

public class Produto extends Object {
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + "tem o pre�o de R$"+preco*(1-desconto);
	}
}

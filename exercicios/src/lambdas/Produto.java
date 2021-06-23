package lambdas;

public class Produto extends Object {
	final String nome;
	final double preco;
	final double desconto;
	double precoFinal;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		precoFinal = preco*(1-desconto);
		return nome + "tem o preço de R$"+precoFinal;
	}
	
	
	
}

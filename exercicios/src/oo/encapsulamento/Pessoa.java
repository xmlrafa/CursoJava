package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
	setIdade(idade);
	setNome(nome);
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	// Getter
	public int getIdade() {
		return idade;
	}
	
	public String toString() {
		return "Ol� eu sou o " + getNome() + " e tenho "
				+ getIdade() + " anos.";
	}
	
	public void setIdade(int novaIdade) {
		novaIdade=Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <=130) {
			this.idade = novaIdade;	
		}
		
	}
}

package streams;

public class Aluno {
	final String nome;
	final double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " tem nota " + nota;
	}
}

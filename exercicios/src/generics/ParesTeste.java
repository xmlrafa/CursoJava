package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.Adicionar(1, "Maria");
		resultadoConcurso.Adicionar(2, "Joao");
		resultadoConcurso.Adicionar(3, "Jose");
		resultadoConcurso.Adicionar(4, "Ana");
		resultadoConcurso.Adicionar(2, "Roberto");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}
}

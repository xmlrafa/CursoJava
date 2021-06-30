package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana", 7);
		
		try {
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		System.out.println("fim :D");

	}
}

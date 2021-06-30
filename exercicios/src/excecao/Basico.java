package excecao;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;

		try {
			imprimirAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento de " + "imprimir o nome do usuário");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// System.out.println("Ocorreu o erro: "+ e.getMessage());
		}
		System.out.println("fim :D");
	}

	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}

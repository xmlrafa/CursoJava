package excecao;

public class Causa {
	public static void main(String[] args) {
		try {
			MetodoA(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}

	static void MetodoA(Aluno aluno) {
		try {
			MetodoB(aluno);
		} catch (Exception cause) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException(cause);
		}
	}

	static void MetodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("ALUNO ESTÁ NULLO!!!");
		}
		System.out.println(aluno.nome);
	}
}

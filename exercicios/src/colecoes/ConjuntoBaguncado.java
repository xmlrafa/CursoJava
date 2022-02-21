package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.1);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(5);
		conjunto.add('x');
		
		
		System.out.println("Tamanho é "+conjunto.size());
		conjunto.add("Teste");
		System.out.println("Tamanho é "+conjunto.size());
		
		conjunto.remove("teste");
		System.out.println(conjunto.size());
		conjunto.remove('x');
		System.out.println(conjunto.contains('x'));
	}
}

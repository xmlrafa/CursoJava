package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		Arroz ingrediante1 = new Arroz(0.200);
		Feijao ingrediante2 = new Feijao(0.100);
		
		System.out.println(convidado.getPeso());
		convidado.Comer(ingrediante1);
		convidado.Comer(ingrediante2);
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.40);
		convidado.Comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}

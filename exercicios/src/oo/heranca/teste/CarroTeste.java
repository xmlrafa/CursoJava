package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Carro civic = new Civic(280);
		civic.Acelerar();
		
		
		Ferrari ferrari = new Ferrari(320);
		ferrari.ligarTurbo();

		ferrari.Acelerar();
		ferrari.Acelerar();
		System.out.println(civic.velocidade);

		System.out.println(ferrari.velocidade);
		
		
		
		
	}
}

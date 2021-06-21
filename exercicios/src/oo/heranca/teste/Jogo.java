package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro Monstro = new Monstro(10, 10);
			
		Heroi Heroi = new Heroi(10, 11);
				
		System.out.println("Monstro tem => "+Monstro.vida);
		System.out.println("Heroi tem => " + Heroi.vida);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		System.out.println("Monstro tem => "+Monstro.vida);
		System.out.println("Heroi tem => " + Heroi.vida);
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		System.out.println("Monstro tem => "+Monstro.vida);
		System.out.println("Heroi tem => " + Heroi.vida);
	
	}
}

package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	
	public boolean atacar(Jogador oponente) {
	boolean Ataque1 = super.atacar(oponente);
	boolean Ataque2 = super.atacar(oponente);
	boolean Ataque3 = super.atacar(oponente);
	return Ataque1 || Ataque2 || Ataque3 ;
	}
}
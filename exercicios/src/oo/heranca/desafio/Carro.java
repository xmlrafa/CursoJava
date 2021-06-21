package oo.heranca.desafio;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;	
	public int velocidade = 0; 
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void Acelerar (){
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {		
		velocidade += delta;
		} 
	}
	public void frear () {
		if (velocidade > 4) {
			velocidade -= 5;
		}
		else {
			velocidade = 0;
		}
	}
}

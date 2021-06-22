package oo.heranca.desafio;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;	
	public int velocidade = 0; 
	private int delta = 5;
	
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void Acelerar (){
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {		
		velocidade += getDelta();
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

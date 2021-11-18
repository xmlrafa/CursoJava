package br.com.aula01;

public class FoodHealthService implements HealthService {

	@Override
	public String getHealthAdvice() {
		return "Alimentar-se de 3 em 3 horas";
	}
	
	
}

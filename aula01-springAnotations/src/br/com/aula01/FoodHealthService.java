package br.com.aula01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("foodHealthService")
public class FoodHealthService implements HealthService {

	@Override
	public String getHealthAdvice() {
		return "Alimentar-se de 3 em 3 horas";
	}
	
	
}

package br.com.aula01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach{

	
	private HealthService healthService;
	
	@Autowired
	public GymCoach(
			@Qualifier("foodHealthService") HealthService healthService) {
		this.healthService = healthService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "3 series de 10 poli-chinelo"; 
	}

	@Override
	public String getHealthAdvide() {
		return healthService.getHealthAdvice();
	}
	
}

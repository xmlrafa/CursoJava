package br.com.aula01;

import org.springframework.beans.factory.annotation.Autowired;

public class VolleiCoach implements Coach {

	private HealthService healthService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Treinar 100 Saques no dia";

	}

	@Override
	public String getHealthAdvide() {
		// TODO Auto-generated method stub
		return healthService.getHealthAdvice();
	}
	@Autowired
	public void setHealthService(HealthService healthService) {
		this.healthService = healthService;
	}


}

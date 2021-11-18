package br.com.aula01;

public class GymCoach implements Coach{

	private HealthService healthService;
	
	public GymCoach(HealthService healthService) {
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

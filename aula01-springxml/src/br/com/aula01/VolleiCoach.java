package br.com.aula01;

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

	public void setHealthService(HealthService healthService) {
		this.healthService = healthService;
	}


}

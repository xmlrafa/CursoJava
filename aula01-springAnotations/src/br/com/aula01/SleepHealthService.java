package br.com.aula01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sleepHealthService")
public class SleepHealthService implements HealthService{

	@Override
	public String getHealthAdvice() {
		// TODO Auto-generated method stub
		return "Durma ao menos 8horas por dia";
	}

}

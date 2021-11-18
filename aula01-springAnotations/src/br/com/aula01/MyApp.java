package br.com.aula01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	
		//Carregar da Configuração Spring o COntexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//resgatar o meu Bean do Contexto
		Coach coach = context.getBean("gymCoach", Coach.class);
		
		// chamar os metodos q eu preciso 
		System.out.println(coach.getDailyWorkout());
		
		
		System.out.println(coach.getHealthAdvide());
		// encerrar o contexto
		context.close();
	}

}

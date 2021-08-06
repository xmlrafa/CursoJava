module app.calculo {
	
	exports br.com.rafa.app.calculo;
	requires transitive app.logging;
	
	exports br.com.rafa.app.calculo.interno 
		to app.financeiro;
	
	requires app.api;
	provides br.com.rafa.app.Calculadora with br.com.rafa.app.calculo.CalculadoraImpl;
}
package br.com.jorgeacetozi.cdi.proxy;

public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora calculadora = new CalculadoraImpl();
		calculadora.soma(2, 2); //sem medidor de tempo
		
		Calculadora calculadoraProxy = new CalculadoraImplComMedidorTempo(calculadora);
		calculadoraProxy.soma(2, 2); //com medidor de tempo
	}
	
}

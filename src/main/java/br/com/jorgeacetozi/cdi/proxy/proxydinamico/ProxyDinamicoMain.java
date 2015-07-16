package br.com.jorgeacetozi.cdi.proxy.proxydinamico;

import br.com.jorgeacetozi.cdi.proxy.Calculadora;
import br.com.jorgeacetozi.cdi.proxy.CalculadoraImpl;

public class ProxyDinamicoMain {
	
	public static void main(String[] args) {
		Calculadora calculadora = new CalculadoraImpl();
		calculadora.soma(2, 2); //sem medidor de tempo
		
		Calculadora calc = (Calculadora) MedidorTempo.newInstance(new CalculadoraImpl());
		calc.soma(2, 2); //com medidor de tempo
		
		ServicoQualquer servico = new ServicoQualquer();
		servico.executa(); //sem medidor de tempo
		
		ServicoQualquer servicoQualquer = (ServicoQualquer) MedidorTempo.newInstance(new ServicoQualquer());
		servicoQualquer.executa();
		
		/*
		 * Agora conseguimos criar um proxy em tempo de execução sem conhecer qual classe será "proxiada".
		 * Poderíamos evoluir isto ainda mais usando annotations... package v2
		 * 
		 *  */
	}

}

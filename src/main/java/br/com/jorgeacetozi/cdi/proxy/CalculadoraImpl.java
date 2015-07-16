package br.com.jorgeacetozi.cdi.proxy;

public class CalculadoraImpl implements Calculadora {

	@Override
	public Integer soma(Integer x, Integer y) {
		return x+y;
	}

}

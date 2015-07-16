package br.com.jorgeacetozi.cdi.proxy;

public class CalculadoraImplComMedidorTempo implements Calculadora {
	
	private Calculadora calculadora;
	
	public CalculadoraImplComMedidorTempo(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	@Override
	public Integer soma(Integer x, Integer y) {
		long inicio = System.nanoTime();
		int resultado = this.calculadora.soma(x, y);
		long fim = System.nanoTime();
				
		System.out.println("Tempo para executar o método: " + (fim-inicio));
		
		return resultado;
	}

}

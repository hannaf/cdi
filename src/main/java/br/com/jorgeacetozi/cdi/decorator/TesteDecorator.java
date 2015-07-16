package br.com.jorgeacetozi.cdi.decorator;

public class TesteDecorator {
	
	public static void main(String[] args) {
		new EnviadorMensagemSimples().envia("Hello CDI");
		new EnviadorMensagemComCriptografia(new EnviadorMensagemSimples()).envia("Hello CDI");
		new EnviadorMensagemCompactada(new EnviadorMensagemComCriptografia(new EnviadorMensagemSimples())).envia("Hello CDI");
		
		/* 
		 * Decorator - Adiciona comportamentos (requisitos funcionais) em tempo de execucao
		 */
	}

}

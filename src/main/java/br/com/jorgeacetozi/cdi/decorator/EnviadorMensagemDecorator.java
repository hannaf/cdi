package br.com.jorgeacetozi.cdi.decorator;

public abstract class EnviadorMensagemDecorator implements EnviadorMensagem {
	
	private EnviadorMensagem enviadorMensagem;

	public EnviadorMensagemDecorator(EnviadorMensagem enviadorMensagem) {
		this.enviadorMensagem = enviadorMensagem;
	}

	public EnviadorMensagem getEnviadorMensagem() {
		return enviadorMensagem;
	}
}

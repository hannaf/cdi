package br.com.jorgeacetozi.cdi.decorator;


public class EnviadorMensagemCompactada extends EnviadorMensagemDecorator {
	
	public EnviadorMensagemCompactada(EnviadorMensagem enviadorMensagem) {
		super(enviadorMensagem);
	}

	@Override
	public void envia(String mensagem) {
		String mensagemCompactada = "Mensagem compactada (tar -czf): " + mensagem;
		this.getEnviadorMensagem().envia(mensagemCompactada);
	}

}

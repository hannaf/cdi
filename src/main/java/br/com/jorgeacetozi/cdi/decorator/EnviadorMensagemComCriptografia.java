package br.com.jorgeacetozi.cdi.decorator;


public class EnviadorMensagemComCriptografia extends EnviadorMensagemDecorator {
	
	public EnviadorMensagemComCriptografia(EnviadorMensagem enviadorMensagem) {
		super(enviadorMensagem);
	}

	@Override
	public void envia(String mensagem) {
		String mensagemCriptografada = "Mensagem que estou criptografando: " + mensagem;
		this.getEnviadorMensagem().envia(mensagemCriptografada);
	}

}

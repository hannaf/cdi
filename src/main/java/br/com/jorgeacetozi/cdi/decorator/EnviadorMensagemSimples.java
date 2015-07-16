package br.com.jorgeacetozi.cdi.decorator;

public class EnviadorMensagemSimples implements EnviadorMensagem {

	@Override
	public void envia(String mensagem) {
		System.out.println(mensagem);
	}

}

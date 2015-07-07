package br.com.jorgeacetozi.cdi.alternative;

public class EnviadorEmailAmazon implements EnviadorEmail {

	@Override
	public void envia(Pedido pedido) {
		System.out.println("Enviando email...");
	}

}

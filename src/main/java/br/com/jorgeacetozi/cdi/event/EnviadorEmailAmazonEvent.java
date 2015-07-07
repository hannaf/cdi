package br.com.jorgeacetozi.cdi.event;

import javax.enterprise.event.Observes;

import br.com.jorgeacetozi.cdi.alternative.EnviadorEmail;
import br.com.jorgeacetozi.cdi.alternative.Pedido;

@Evento //Qualifier somente para resolver duplicidade com o EnviadorEmailAmazon do pacote alternative
public class EnviadorEmailAmazonEvent implements EnviadorEmail {
	
	@Override
	public void envia(@Observes Pedido pedido) {
		System.out.println("Enviando e-mail atraves de eventos...");
	}
	
}

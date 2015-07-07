package br.com.jorgeacetozi.cdi.event;

import javax.enterprise.event.Observes;

import br.com.jorgeacetozi.cdi.alternative.Pagador;
import br.com.jorgeacetozi.cdi.alternative.Pedido;

@Evento //Qualifier somente para resolver duplicidade com o PagadorWebService do pacote alternative
public class PagadorWebServiceEvent implements Pagador {

	@Override
	public void paga(@Observes Pedido pedido) {
		System.out.println("Pagando atraves de eventos...");
	}

}

package br.com.jorgeacetozi.cdi.event;

import javax.enterprise.event.Observes;

import br.com.jorgeacetozi.cdi.alternative.Estoque;
import br.com.jorgeacetozi.cdi.alternative.Pedido;

@Evento //Qualifier somente para resolver duplicidade com o EstoqueReal do pacote alternative
public class EstoqueRealEvent implements Estoque {

	@Override
	public void atualiza(@Observes Pedido pedido) {
		System.out.println("Atualizando estoque atraves de eventos...");
	}

}

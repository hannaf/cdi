package br.com.jorgeacetozi.cdi.event;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import br.com.jorgeacetozi.cdi.alternative.FechadorPedido;
import br.com.jorgeacetozi.cdi.alternative.Pedido;


/*
 * 1) Menor acoplamento do que o FechadorPedidoLegado
 * 2) Poderiamos ligar esta funcionalidade usando @Alternative
 */

@Evento //Qualifier somente para resolver duplicidade com o FechadorPedidoLegado do pacote alternative
public class FechadorPedidoEvent implements FechadorPedido {

	@Inject
	private Event<Pedido> pedidoEvent;
	
	@Override
	public void fecha(Pedido pedido) {
		pedidoEvent.fire(new Pedido());
	}

}

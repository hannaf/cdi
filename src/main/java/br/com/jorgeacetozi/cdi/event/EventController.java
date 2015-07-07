package br.com.jorgeacetozi.cdi.event;

import javax.inject.Inject;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.jorgeacetozi.cdi.alternative.Pedido;

@Controller
public class EventController {
	
	@Inject
	@Evento
	private FechadorPedidoEvent fechadorPedidoEvent;
	
	@Inject
	private Result result;
	
	public void example() {
		fechadorPedidoEvent.fecha(new Pedido());
		result.include("event", "Fired event!");
	}
}

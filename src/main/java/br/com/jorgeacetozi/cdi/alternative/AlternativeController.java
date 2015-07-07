package br.com.jorgeacetozi.cdi.alternative;

import javax.inject.Inject;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class AlternativeController {
	
	@Inject
	private FechadorPedido fechadorPedido;
	
	@Inject
	private Result result;
	
	public void example() {
		fechadorPedido.fecha(new Pedido());
		result.include("alternative", fechadorPedido.getClass());
	}
}

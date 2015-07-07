package br.com.jorgeacetozi.cdi.alternative;

import javax.enterprise.inject.Alternative;

//Alternative pode ser usado em metodo?

@Alternative
public class FechadorPedidoBucket implements FechadorPedido {

	@Override
	public void fecha(Pedido pedido) {
		System.out.println("Usando alternative");
	}

}

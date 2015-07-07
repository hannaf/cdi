package br.com.jorgeacetozi.cdi.alternative;

import javax.inject.Inject;

public class FechadorPedidoLegado implements FechadorPedido {
	
	private Pagador pagador;
	private Estoque estoque;
	private EnviadorEmail enviadorEmail;

	/* CDI Eyes Only */
	public FechadorPedidoLegado() {
	}
	
	@Inject
	public FechadorPedidoLegado(Pagador pagador, Estoque estoque, EnviadorEmail enviadorEmail) {
		this.pagador = pagador;
		this.estoque = estoque;
		this.enviadorEmail = enviadorEmail;
	}

	@Override
	public void fecha(Pedido pedido) {
		pagador.paga(pedido);
		estoque.atualiza(pedido);
		enviadorEmail.envia(pedido);
	}
}

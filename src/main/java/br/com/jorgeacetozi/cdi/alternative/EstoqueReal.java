package br.com.jorgeacetozi.cdi.alternative;

public class EstoqueReal implements Estoque {

	@Override
	public void atualiza(Pedido pedido) {
		System.out.println("Atualizando estoque...");		
	}

}

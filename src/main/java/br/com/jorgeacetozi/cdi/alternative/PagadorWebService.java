package br.com.jorgeacetozi.cdi.alternative;

public class PagadorWebService implements Pagador {

	@Override
	public void paga(Pedido pedido) {
		System.out.println("Efetuando pagamento via webservice...");
	}

}

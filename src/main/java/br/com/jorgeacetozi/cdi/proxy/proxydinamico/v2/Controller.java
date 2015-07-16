package br.com.jorgeacetozi.cdi.proxy.proxydinamico.v2;

public class Controller {
	
	@Injeta
	public ProdutoService produtoService;
	
	public void salvaProduto(){
		produtoService.salva();
	}
	
}

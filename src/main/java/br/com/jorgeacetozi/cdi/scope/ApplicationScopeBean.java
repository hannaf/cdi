package br.com.jorgeacetozi.cdi.scope;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class ApplicationScopeBean {
	
	private String msg;

	@PostConstruct
	public void init() {
		this.msg = "Mensagem vinda de um bean ApplicationScoped";
	}
	
	public String getMsg() {
		return msg;
	}
	
}

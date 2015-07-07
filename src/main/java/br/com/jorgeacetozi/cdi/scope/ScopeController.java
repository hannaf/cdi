package br.com.jorgeacetozi.cdi.scope;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.hibernate.Session;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
@RequestScoped
public class ScopeController {
	
	@Inject
	private Result result;
	
	@Inject
	@MinhaSession
	private Session session;
	
	public void example() {}
	
	@Get("/scope/requestscope")
	public void salva(){
		session.getTransaction().begin();
		
		Usuario usuario = new Usuario("Jorge");
		session.saveOrUpdate(usuario);
		
		session.getTransaction().commit();
		
		result.of(this).example();
	}
	
}

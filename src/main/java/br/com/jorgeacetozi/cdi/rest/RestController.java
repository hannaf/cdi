package br.com.jorgeacetozi.cdi.rest;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.jorgeacetozi.cdi.scope.Usuario;

@Controller
public class RestController {
	
	@Inject
	private Result result;
	
	@Get("/api/usuarios")
	public void json() {
		result.use(Results.json()).from(new Usuario("Jorge Acetozi")).serialize();
	}

}
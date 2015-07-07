package br.com.jorgeacetozi.cdi.scope;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;

import org.hibernate.Session;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Status;

@ConversationScoped
@Controller
public class ScopeConversationController implements Serializable {
	
	@Inject
	@MinhaSession
	private Session session;
	
	private String nome;
	private String sobrenome;
	
	@Inject
	private Result result;
	
	@Inject
	private Conversation conversation;
	
	@Get("/scope/conversationscope/inicia")
	public void inicia(){
		conversation.begin();
	}
	
	@Get("/scope/conversationscope/nome")
	public void nome(){
		this.nome = "Jorge ";
	}
	
	@Get("/scope/conversationscope/sobrenome")
	public void sobrenome(){
		this.nome = "Acetozi";
	}
	
	@Get("/scope/conversationscope/termina")
	public void termina(){
		session.getTransaction().begin();
		session.save(new Usuario(nome+sobrenome));
		session.getTransaction().commit();
		
		conversation.end();
	}
}

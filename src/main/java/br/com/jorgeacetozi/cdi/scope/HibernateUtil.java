package br.com.jorgeacetozi.cdi.scope;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	@Produces
	@ApplicationScoped
	@MinhaSession
	public SessionFactory buildFactory(){
		return new Configuration().configure().buildSessionFactory();
	}
	
	@Produces
	@RequestScoped
	@MinhaSession
	public Session getSession(@MinhaSession SessionFactory factory) {
		return factory.openSession();
	}
	
	public void destroy(@Disposes @MinhaSession Session session) {
		session.close();
	}
}

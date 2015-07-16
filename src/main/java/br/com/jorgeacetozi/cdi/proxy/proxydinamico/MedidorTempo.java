package br.com.jorgeacetozi.cdi.proxy.proxydinamico;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MedidorTempo implements MethodInterceptor {
	
	private Object encapsulated;

	public static final Object newInstance(Object encapsulated) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(encapsulated.getClass());
		enhancer.setCallback(new MedidorTempo(encapsulated));
		return enhancer.create();
	}
	
	public MedidorTempo (Object encapsulated) {
		this.encapsulated = encapsulated;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		long inicio = System.nanoTime();
		Object invoke = method.invoke(encapsulated, args);
		long fim = System.nanoTime();
			
		System.out.println("Tempo para executar o método: " + (fim-inicio));
		return invoke;
	}


}

package br.com.jorgeacetozi.cdi.proxy.proxydinamico.v2;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.sf.cglib.proxy.Enhancer;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import br.com.jorgeacetozi.cdi.proxy.proxydinamico.MedidorTempo;

public class MeuCDI {

	private static Map<Class<?>, Object> mapa = new HashMap<>();

	static {
		Reflections reflections = new Reflections("br.com.jorgeacetozi.cdi.proxy.proxydinamico.v2",	new FieldAnnotationsScanner());
		Set<Field> camposAnotadosComInjeta = reflections.getFieldsAnnotatedWith(Injeta.class);

		for (Field field : camposAnotadosComInjeta) {
			try {
				Class<?> clazz = field.getDeclaringClass();
				Object instanciaDaClasseQueContemCampoAnotadoComInjeta = field.getDeclaringClass().newInstance();
				Object instanciaDoCampoAnotadoComInjeta = field.getType().newInstance();
				
				if (instanciaDoCampoAnotadoComInjeta.getClass().isAnnotationPresent(Tempo.class)) {
					Enhancer enhancer = new Enhancer();
					enhancer.setSuperclass(field.getType());
					enhancer.setCallback(new MedidorTempo(field.getType().newInstance()));
					field.set(instanciaDaClasseQueContemCampoAnotadoComInjeta, enhancer.create());
				} else {
					field.set(instanciaDaClasseQueContemCampoAnotadoComInjeta, field.getType().newInstance());
				}
				
				mapa.put(clazz, instanciaDaClasseQueContemCampoAnotadoComInjeta);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static final Object getBean(Class<?> clazz) {
		Object object = mapa.get(clazz);
		if (object == null) {
			throw new RuntimeException("Não sei resolver esta dependëncia...");
		}
		return object;
	}

	public static void main(String[] args) {
		Controller controller = (Controller) MeuCDI.getBean(Controller.class);
		controller.salvaProduto();
	}
}

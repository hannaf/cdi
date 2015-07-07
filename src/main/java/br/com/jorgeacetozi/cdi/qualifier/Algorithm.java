package br.com.jorgeacetozi.cdi.qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE; 

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Inject;
import javax.inject.Qualifier;

/*@Inherited vs @Specializes

Se vc deixar @Inherited e tiver um injection point assim:

@Inject
@Algorithm(name = SorterAlgorithm.QUICK_SORT)

Tera um problema, pq tanto QuickSort quanto QuickSortHeuristica serao candidatos.

Se vc tirar o @Inherited e deixar o @Specializes em QuickSortHeuristica e tiver o mesmo
injection point acima, tera o QuickSortHeuristica injetado, pq o @Specializes sempre da
prioridade para a subclasse ser injetada.

*/

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {TYPE, PARAMETER, METHOD, FIELD})
@Qualifier
public @interface Algorithm {
	SorterAlgorithm name();
}

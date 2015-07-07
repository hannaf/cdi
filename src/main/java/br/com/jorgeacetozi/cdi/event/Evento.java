package br.com.jorgeacetozi.cdi.event;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {TYPE, PARAMETER, METHOD, FIELD})
@Qualifier
public @interface Evento {
}

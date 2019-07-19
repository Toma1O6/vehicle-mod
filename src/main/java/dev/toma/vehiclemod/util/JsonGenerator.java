package dev.toma.vehiclemod.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonGenerator {
	
	String intName() default "_stage_";
	
	String boolName() default "_on";
}

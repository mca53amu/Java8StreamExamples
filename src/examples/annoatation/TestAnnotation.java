package examples.annoatation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import examples.CustomAnnotationExample;

public class TestAnnotation {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		Method[] declaredMethods = CustomAnnotationExample.class.getDeclaredMethods();

		for (Method method : declaredMethods) {

			Annotation[] annotations = method.getAnnotations();

			for (Annotation annotation : annotations) {
				System.out.println(annotation);
				if (annotation instanceof MethodCall) {
					System.out.println("I am called because you have declared MethodCall Annotation");
				}

			}
			
			Annotation[][] parameterAnnotationsList = method.getParameterAnnotations();
			
			for (Annotation[] parameterAnnotations : parameterAnnotationsList) {
				
				for (Annotation annotation : parameterAnnotations) {
					System.out.println("I am called because you have declared parameter annotation");
				}
				
			}
		}

	}

}

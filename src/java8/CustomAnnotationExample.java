package java8;

import java8.annoatation.ClassCall;
import java8.annoatation.EmailFormat;
import java8.annoatation.MethodCall;

@ClassCall
public class CustomAnnotationExample {

	@MethodCall
	public void testEmail(@EmailFormat String email) {
		System.out.println("I am test method"+email);
	}

}

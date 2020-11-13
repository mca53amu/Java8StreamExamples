package examples;

import examples.annoatation.ClassCall;
import examples.annoatation.EmailFormat;
import examples.annoatation.MethodCall;

@ClassCall
public class CustomAnnotationExample {

	@MethodCall
	public void testEmail(@EmailFormat String email) {
		System.out.println("I am test method"+email);
	}

}

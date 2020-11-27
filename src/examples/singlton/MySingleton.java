package examples.singlton;

import java.util.StringTokenizer;

public class MySingleton {

	private static volatile MySingleton instance;

	private MySingleton() {
		// TODO Auto-generated constructor stub
	}

	public MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				
				if (instance==null) {
					instance = new MySingleton();
					String s="";
					
				}
			}
			
		}
		return instance;
	}	
	

}

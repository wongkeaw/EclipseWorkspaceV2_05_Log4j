package com.mkyong;

import org.apache.log4j.Logger;

public class HelloExample2{
	
	final static Logger logger = Logger.getLogger(HelloExample2.class);
	
	public static void main(String[] args) {
		for (int i = 0; i < 100000 ; i++) {
			mainx();
			
		}
	}
	public static void mainx() {
	
		HelloExample2 obj = new HelloExample2();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}
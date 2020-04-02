package com.qa.main;

/**
 * @author BEAST
 *
 */
public class divisionHandler {
	
	public divisionHandler(){	
	}

	public int divide(int a, int b){
		 
		int c = 0;
		try{
			c = a / b; 
		}
		
		catch(ArithmeticException AE){	
			System.out.println("That was an arithmetic exception! NO!");
			AE.printStackTrace();
		}
		
		catch(RuntimeException RE){
			System.err.println("That was a runtime exception!");
			RE.printStackTrace();
		}
	
		catch (Exception e){
			System.err.println("Exceptional expetion! ");
			e.printStackTrace();
		}
		
		System.out.println("Result of division: " + c);
		return 0;
	}
}

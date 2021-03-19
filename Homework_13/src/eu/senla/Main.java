package eu.senla;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		
   	     
		try {
			arifmetic(2,0);
		} catch (ArithmeticException e) {
			System.err.println("ALARM DELIT NA 0!!!");
			
			System.out.println("/////////////////////////////////////////////////////");
		}
/////////////////////////////////////////////////////////////////////////////////////////////////		
		
	
	Enter enter = new Enter();
    List list= Arrays.asList("JECK","BLACK", null, "MAKS", null, "BARRY");

    for (Object s:list) {
        try {
            enter.enter(s);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("YACHEIKA PUSTA...");
        }
    }

}

	private static int arifmetic(int i, int j) {
		 return i/j;
		
	}

	
}

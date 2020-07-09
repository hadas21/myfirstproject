package class13;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {

		ArrayList <String> colors = new ArrayList <String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("white");
		colors.add("orange");
		colors.add("blue");
		colors.add("yellow");
		
		
		colors.add(0, "purple");
			for(String element : colors ) {
			System.out.println(element);
		}			System.out.println("--------");
		
		colors.set(2, "pup");
			for(String element : colors ) {
			System.out.println(element);
		}		System.out.println("--------");

		colors.remove(2);
			for(String element : colors ) {
			System.out.println(element);
			}		System.out.println("--------");
	
	
		if (colors.contains("red")) {
            System.out.println("color red found.");	
            System.out.println("--------");
            
        Collections.shuffle(colors);
             System.out.println(colors);    
             System.out.println("--------");        	
        }
        	
        }
        
   

}

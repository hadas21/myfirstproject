package inheritance;

import java.util.Arrays;

public class athlete {
	
	String name;
	String[]  achieve;
	int age;
	
	public athlete () {
		System.out.println("creating athlete");
		
	}
	
	public athlete(String name, int age,String[] achieve ){
		this.name = name;
		this.age = age;
		System.out.println("athlete constructer");
	}


	@Override
	public String toString() {
		return "athlete [name=" + name + ", achieve=" + Arrays.toString(achieve) + ", age=" + age + "]";
	}
	
	

}

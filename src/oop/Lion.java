package oop;

public class Lion {

	int height;
	int  weight;
	String color;
	double roarDecibels;
	Lion  myLion;
	int newHeight;
	
	Lion(){
		
	}
	void roar(){
		System.out.println("roarrrrrr");
	}
	
	void sleep() {
		System.out.println("zzzzz");
	}
	
	String hunt() {
		return "rabbit";		
	}
	
	void lionColor(){
		System.out.println(color);
	}
	
	public void newHeight(int newHeight) {
		height = newHeight;
	}

	@Override
	public String toString() {
		return "Lion [height=" + height + ", weight=" + weight + ", color=" + color + ", roarDecibels=" + roarDecibels
				+ ", myLion=" + myLion + "]";
	}
	

	}
	
	

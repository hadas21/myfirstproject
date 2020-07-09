package oop;

public class myLion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion myLion;
		myLion = new Lion();
		
		

		myLion.height = 120;


		myLion.weight = 207;

		myLion.color = "brown";

		myLion.roarDecibels = 113.34;
		
            
		myLion.roar();
		String prey = myLion.hunt();
		System.out.println(prey);
		myLion.lionColor();
		
		myLion.newHeight(200);
System.out.println(myLion.toString());		
	}

	

}

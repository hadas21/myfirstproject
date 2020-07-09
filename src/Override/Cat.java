package Override;


public class Cat extends Animals{
	
	@Override
	public void info (int number) {
		System.out.println("I have " + number + " cats.");
	}

}

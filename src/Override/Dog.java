package Override;

public class Dog extends Animals {
	
	@Override
	public void info (int number) {
		System.out.println("I have " + number + " dogs.");
	}

}

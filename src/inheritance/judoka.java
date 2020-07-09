package inheritance;

public class judoka extends athlete{
	
	double weight;
	
	public judoka() {
		
		System.out.println("creating judoka");
	}
	
	public judoka (String name,int age,  String[] achieve, double weight) {
		super(name, age, achieve);
		this.weight = weight;
	}

}

package player;

public class playerclass {

	String name;
	int points;
	
	playerclass(String name, int points){
		this.name = name;
		this.points = points;
		System.out.println(name + " " + points);
	
	}
	
	playerclass(String name){
		this.name = name;
		System.out.println(name );
		
	}
	
	playerclass(){
		System.out.println("I am an empty constructer");
		
		
	}

	@Override
	public String toString() {
		return "playerclass [name=" + name + ", points=" + points + "]";
	}
	
	public void totalPoints(int totalPoints) {
		points += totalPoints; 
		
	}
	
	
}


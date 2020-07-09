package player;

public class player1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		playerclass player1;
		player1 = new playerclass("jake" , 0);
		
		
		
		String ev = player1.toString();
		System.out.println(ev);
		
		
		player1.totalPoints(40);
		
		
		System.out.println(player1.toString());

		

	}

	
}

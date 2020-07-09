package polymorphism;

public class superinsects {

	public static void main(String[] args) {
		
		insects allinsects[] = new insects[3];

		
		allinsects[0] = new spider();
		allinsects[1] = new roach();
		allinsects[2] = new ant();
		
		for (int i = 0; i < allinsects.length; i++) {
			
			allinsects[i].eat();
			
		}
		
		System.out.println(allinsects[0]);
		
	}

}

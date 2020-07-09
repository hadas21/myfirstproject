
public class class17 {

	public static void main(String[] args) {
		Thread getTime = new GetTime20();
		
		getTime.start();
		
		Runnable getmail = new GetMail(10);
		
		getmail.run();
		
		

	}

}

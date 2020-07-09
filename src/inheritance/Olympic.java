package inheritance;

public class Olympic {

	public static void main(String[] args) {
	
		judoka yarden = new judoka();
		
		yarden.name = "Yarden Gerbi";
		String[] yardenAchieve = {"Rio Olympic 2017, Bronze",
				            "Paris Grand Slam 2015, Bronze",
				            "Judo World 2014, Silver"};
		yarden.achieve = yardenAchieve;
		
		System.out.println(yarden.toString());
		}
		

	}



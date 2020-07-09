package Override;

public class run {

	public static void main(String[] args) {
		 Animals Cat = new Cat();
			printinfo(Cat);
			
			Animals Dog = new Dog();
			printinfo(Dog);
		}
		
		
		public static void printinfo (Animals pet) {
			pet.info(5);
		}


	
}

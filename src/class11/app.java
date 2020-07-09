package class11;

public class app {

	public static void main(String[] args) {
		
		iceCream myIceCream = new iceCream("vanilla");
		System.out.println("#1 main >> " + myIceCream);
		changeFlavor(myIceCream);
		System.out.println("#2 main >> " + myIceCream);
	}
	
	public static void changeFlavor(iceCream icecream) {
		System.out.println("#1 method >> " + icecream);
		icecream.setFlavor("pasionfruit");
		
		System.out.println("#2 method >> " + icecream);
	}
	

}

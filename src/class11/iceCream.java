package class11;

public class iceCream {
   String flavor;
   
  
   
   

public iceCream(String flavor) {
	this.flavor = flavor;
}

public String getFlavor() {
	   return flavor;
   }
   
   public void setFlavor(String flavor) {
	  this.flavor = flavor;	  
   }

@Override
public String toString() {
	return "iceCream [flavor=" + flavor + "]";
}
   
   
}

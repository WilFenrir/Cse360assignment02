package cse360assignment02;

public class AddingMachine {
	private int total;
	private String past;
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    past = "0"; //set past to 0 string as beginning
	  }
	  
	  public int getTotal () {
	    return total; //return total to be used as needed
	  }
	  
	  public void add (int value) {
		  past = past + " + " + value;
		  total += value;
	  }

	  public void subtract (int value) {
		  past = past + " - " + value;
		  total -= value;
	  }

	  public String toString () {
	    return past;
	  }

	  public void clear() {
		  total = 0; //set total back to 0
		  past = "0"; //set past back to 0
	  }


	  public static void main(String[] args) {	
		  // TODO Auto-generated method stub
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add (4); 
		  myCalculator.subtract (2); 
		  myCalculator.add(5);
		  System.out.println(myCalculator.toString() + " = " + myCalculator.getTotal());

	  }
	  
}


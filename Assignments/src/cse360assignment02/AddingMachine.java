package cse360assignment02;

public class AddingMachine {
	private int total;
	private String past;
	
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    past = "0"; //set past to the 0 string
	  }
	  
	  public int getTotal () {
	    return total; //return current total
	  }
	  
	  public void add (int value) {
		  past = past + " + " + value; //add the addition to machine history
		  total += value;//add value to the total
	  }

	  public void subtract (int value) {
		  past = past + " - " + value; //add the subtraction to machine history
		  total -= value; // subtract value from the total
	  }

	  public String toString () {
	    return past; //return machine history
	  }

	  public void clear() {
		  total = 0; //set total back to 0
		  past = "0";//reset past to 0 string
	  }


	  public static void main(String[] args) {	
		  // TODO Auto-generated method stub
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add (4); 
		  myCalculator.subtract (2); 
		  myCalculator.add(5);
		 System.out.println(myCalculator.toString());
		 System.out.println(myCalculator.getTotal());

	  }
	  
}


package aggregation;

public class Phone {
      String phoneName;
      Sim sim;
      public Phone(String phoneName, Sim sim)
      {
    	  this.phoneName= phoneName;
    	  this.sim =sim;
      }
      public void display() {
    	  System.out.println(this.phoneName + " " + this.sim.phoneNo);
      }
}

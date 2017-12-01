
public class Bicycle implements IBicycle{
	
	int gear;
	int speed;
	int cadence;
	String name;

	public void changeCadence(int newValue) {
	
		cadence = newValue;
		
	}
	
	public void changeGear(int newValue) {
		
		gear = newValue;
		
	}

   public void applyBrakes(int decrement) {
	   
	   speed = speed - decrement;
   
   }
   
  public void printDetails() {
	  
	  System.out.println("Name : "+name+"\nSpeed : "+speed+"\nGear : "+gear+"\nCadence : "+cadence);
	  
  }
}




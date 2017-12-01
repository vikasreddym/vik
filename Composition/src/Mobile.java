
public class Mobile {

	private String make;
	private String model;
	Battery battery;
	

	public Mobile(String productname, String model, Battery battery) {
		
		this.make = productname;
		this.model = model;
		this.battery = battery;
		
	}

	public String getProductname() {
		
		return make;
		
	}

    public void setProduct(String productname) {
    	
    	this.make = productname;
    	
    }

    public String getModel() {
    	
    	return model;
    	
    }

   public void setModel(String model) {
	   
	   this.model = model;
	   
   }

  public Battery getBattery() {
	  
	  return battery;
  
  }

  public void setBattery(Battery battery) {
	  
	  this.battery = battery;
	  
  }
}



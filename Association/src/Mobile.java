
public class Mobile {
	
	private String make;
	private String model;
	Camera camera;
	

	public Mobile(String productname, String model) {
		
		this.make = productname;
		this.model = model;
		
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
}


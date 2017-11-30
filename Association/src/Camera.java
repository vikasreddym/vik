
public class Camera {
	
	private String company;
	private int pixels;
	



public Camera(String company, int pixels) {
		
		this.company = company;
		this.pixels = pixels;
		
	}

	public String getCompany() {
		
		return company;
		
	}

    public void setCompany(String company) {
    	
    	this.company = company;
    	
    }

    public int getPixels() {
    	
    	return pixels;
    	
    }

   public void setPixels(int pixels) {
	   
	   this.pixels = pixels;
	   
   }

}

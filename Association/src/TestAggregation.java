
public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile("iphone", "8plus");
		Camera c = new Camera("lens", 1080);
		m.camera = c;
		System.out.println(m.getProductname()+ m.getModel()+ m.camera.getCompany()+ m.camera.getPixels());

	}

}


public class TestComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Battery b = new Battery("320");
		Mobile m = new Mobile("iphone", "8plus",b);
		m.battery = b;
		System.out.println(m.getProductname()+ m.getModel()+ m.battery.getCapacity());

	}

}

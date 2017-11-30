
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOrdersService i = new Order("Shirt",10000,"520 mapple st,ws,64093",300);
		i.purchaseitem();
		i.purchaseitem(150);
		
	}

}

public class PhoneMain {
	public static void main(String[] args) {
		Phone ph1 = new Phone();
		ph1.model = "Note10";
		ph1.price = 25;
		
		Phone ph2 = new Phone();
		ph2.model = "IPhone";
		ph2.price = 100;
		
		ph1.toPrint();
		ph2.toPrint();
		
		Phone ph3 = new Phone("S20", 10);
		ph3.toPrint();
		ph3.printTotal();
	}
}
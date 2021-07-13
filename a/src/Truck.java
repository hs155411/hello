
public class Truck extends Car {

	Truck(String name) {
		System.out.println("ÀÚ½Ä Truck »ý¼ºÀÚ" + name);
	}
	
	int ton;
	void print() {
		System.out.println(carname + color + " : " + ton + "Åæ");
	}
	
	public static void main(String[] args) {
		Truck ºÀ°í = new Truck("ºÀ°í2");
	}
}
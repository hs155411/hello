
public class Phone {
	String model;
	int price;
	static int total;
	
	Phone() {
		total++;
	}
	
	Phone(String model) {
		this();
		this.model = model;
	}
	Phone(String model, int price) {
		this();
		this.model = model;
		this.price = price;
	}
	
	void toPrint() {
		System.out.println(price + "만원짜리 " + model + " 스마트폰");
	}
	
	void printTotal() {
		System.out.println("핸드폰 총 개수 : " + total);
	}
}

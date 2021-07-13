
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
		System.out.println(price + "����¥�� " + model + " ����Ʈ��");
	}
	
	void printTotal() {
		System.out.println("�ڵ��� �� ���� : " + total);
	}
}
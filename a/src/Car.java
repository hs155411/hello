
public class Car {
	Car(String name) {
		System.out.println("�θ� Car ������" + name);
	}
	Car() {
		System.out.println("�θ� Car ������ �⺻��");
	}
	String carname;
	String color = "������";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + " ����ӵ� : " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + "����ӵ� : " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}

public class Animal {
	
	Animal() {}
	
	Animal(String kind, String name, int age, String toy) {
		this(name, name, age);
		System.out.println(name + toy + "�� �����մϴ�.");
	}
	Animal(String kind, String name, int age) {
		this.kind = kind;
		this.name = name;
		this.age = age;
		count++;
	}
	
	String name;
	private String kind;
	private int age;
	private static int count;
	private String toy;
	static void printCount() {
		System.out.println("���� �� " + count + "������ �ֽ��ϴ�.");
	}
	
	void print(String name, int age) {
		System.out.println(name + age);
	}
	
	void print(String name) {
		System.out.println(kind + name + age);
	}
	void print() {
		System.out.println("�� ������ �̸��� " + name);
	}
	
	void setToy(String toy) {
		this.toy = toy;
	}
	String getToy() {
		return toy;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age;
	}
}
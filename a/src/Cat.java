
public class Cat extends Animal{
	private String name;

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "�̹�";
		animal.print();
		
		Cat cat = (Cat) animal;
		cat.print();
		
		cat.name = "����";
		cat.print();
		animal.print();
	}
}
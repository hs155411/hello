
public class Cat extends Animal{
	private String name;

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "미미";
		animal.print();
		
		Cat cat = (Cat) animal;
		cat.print();
		
		cat.name = "주주";
		cat.print();
		animal.print();
	}
}

public class Dog {
	Dog() {}
	
	Dog(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println(breed + "이(가) 짖습니다.");
	}
	
	void hungry() {
		System.out.println(breed + "이(가) 배고파요");
	}
	
	void sleeping() {
		System.out.println(breed + "이(가) 잠자요");
	}
	
	String toPrint(String breed, int age, String color) {
		String str = "(" + breed + " : " + age + " : " + color + ")";
		return str;
	}
	
}
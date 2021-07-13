import java.util.Scanner;

public class Day07_AnimalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kind, name, toy;
		int age;
		System.out.print("동물종류 : ");
		kind = sc.next();
		System.out.print("동물이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		Animal animal1 = new Animal(kind, name, age);
		animal1.printCount();
		animal1.print(name);
		animal1.print(name, age);
		
		System.out.print("동물종류 : ");
		kind = sc.next();
		System.out.print("동물이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("장난감 : ");
		toy = sc.next();
		
		Animal animal2 = new Animal(kind, name, age, toy);
		animal2.printCount();
		animal2.setToy("빨간공");
		System.out.println(animal1.getToy() + "을 좋아합니다.");
	}
}
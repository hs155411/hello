
public class DogMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "스피츠";
		dog1.age = 5;
		dog1.color = "화이트";
		
		dog1.barking();
		dog1.sleeping();
		
		Dog dog2 = new Dog("불독", 3, "블랙");
		dog2.hungry();
		
		String str = dog2.toPrint("푸들", 7, "브라운");
		System.out.println(str);
	}
}
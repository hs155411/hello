
public class DogMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "������";
		dog1.age = 5;
		dog1.color = "ȭ��Ʈ";
		
		dog1.barking();
		dog1.sleeping();
		
		Dog dog2 = new Dog("�ҵ�", 3, "��");
		dog2.hungry();
		
		String str = dog2.toPrint("Ǫ��", 7, "����");
		System.out.println(str);
	}
}

public class Fish extends Animal {

	void swin() {
		System.out.println(name + "�� ���Ĩ�ϴ�.");
	}

	public static void main(String[] args) {
		Fish myfish = new Fish();
		myfish.name = "�˷���";
		myfish.setAge(3);
		
		myfish.swin();
	}
}
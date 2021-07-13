
public class Fish extends Animal {

	void swin() {
		System.out.println(name + "가 헤엄칩니다.");
	}

	public static void main(String[] args) {
		Fish myfish = new Fish();
		myfish.name = "알록이";
		myfish.setAge(3);
		
		myfish.swin();
	}
}

public class 리더_Main {

	public static void main(String[] args) {
		리더 leader1 = new 리더("홍길동", "20500", false);
		leader1.isLeader();
		
		리더 leader2 = new 리더("윤재윤", "20509", true);
		leader2.isLeader();
		
		leader1.printStudent();
		leader2.printStudent();
	}
}
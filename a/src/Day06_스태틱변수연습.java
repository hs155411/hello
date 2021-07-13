
public class Day06_스태틱변수연습 {
	public static void main(String[] args) {
		학생 a = new 학생();
		a.grade = 1;
		a.name = "홍길동";
		a.print();
		
		학생 b = new 학생();
		b.grade = 2;
		b.name = "김정";
		b.school = "서울고";
		b.print();
		
		학생 c = new 학생();
		c.grade = 3;
		c.name = "현수";
		c.school = "서울여고";
		c.print();
	}
}
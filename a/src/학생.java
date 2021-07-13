
public class 학생 {
	학생() {
		count++;
	}
	
	static int count = 0;
	static String school = "Robot";
	String name;
	int grade;
	
	void print() {
		System.out.println(count + "번째학생 " + school + name + " : " + grade + "학년");
	}
}
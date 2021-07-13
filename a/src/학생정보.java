
public class 학생정보 {
	학생정보(){}
	학생정보(String hakbun , String name, int age, String phone){
		this.hakbun = hakbun;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	학생정보(String name, String hakbun, boolean leader) {
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	String hakbun;
	String name;
	int age;
	String phone;
	boolean leader = false;
	
	protected void printStudent() {
		System.out.println(name + "," + hakbun + "," + phone);
	}
}

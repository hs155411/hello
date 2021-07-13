class Father {
	String name;
	
	Father(String name) {
		this.name = name;
		System.out.println("Father 积己磊 " + this.name);
	}
}

public class MyClass extends Father {
	MyClass (String name) {
		super(name);
		System.out.println("MyClass 积己磊 " + super.name);
	}
	public static void main(String[] args) {
		MyClass a = new MyClass("全辨悼");
	}
}
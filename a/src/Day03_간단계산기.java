import java.util.Scanner;

public class Day03_���ܰ��� {

	public static void main(String[] args) {
		int a, b;
		String op;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� : ");
		a = scanner.nextInt();
		
		System.out.print("���� : ");
		b = scanner.nextInt();
	
		System.out.println("������ : ");
		op = scanner.next();
		
		if (op == "+")
			System.out.println(a + "+" + b + "=" + (a + b));
	}

}

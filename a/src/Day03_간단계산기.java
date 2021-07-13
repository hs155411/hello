import java.util.Scanner;

public class Day03_간단계산기 {

	public static void main(String[] args) {
		int a, b;
		String op;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		a = scanner.nextInt();
		
		System.out.print("숫자 : ");
		b = scanner.nextInt();
	
		System.out.println("연산자 : ");
		op = scanner.next();
		
		if (op == "+")
			System.out.println(a + "+" + b + "=" + (a + b));
	}

}

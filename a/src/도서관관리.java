import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		Book b1 = new Book("Java ������", 10);
		b1.printBookCount();

		Book b2 = new Book("���̽� ����", 20);
		b2.printBookCount();

		Book b3 = new Book("C��� ��ȭ", 100);
		b3.printBookCount();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���Ͻô� �۾��� �������ּ���(1 : ����, 2 : �ݳ�)");
			int job = sc.nextInt();
			if (job == 1) {
				System.out.print("���ϴ� ���� : ");
				int count = sc.nextInt();
				b3.rentalBook(count);
			} else {
				System.out.println("�ݳ��� ����");
				int count = sc.nextInt();
				b3.returnBook(count);
			}
		}
		
		
		// b3.rentalBook(10);
		// b3.rentalBook(20);
		// b3.returnBook(5);
	}
}
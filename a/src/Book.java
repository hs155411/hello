
public class Book {
	Book(String name, int count) {
		bookName = name;
		this.count = count;
	}
	String bookName;
	int count;
	
	void printBookCount() {
		System.out.println(bookName + " : " + count + "��");
	}
	
	void rentalBook(int count) {
		if (count > this.count)
			System.out.println("����� �����մϴ�." + "������� : " + this.count);
		else {
			this.count = this.count - count;
			System.out.println(bookName + " : " + count + "�� ����");
			printBookCount();          
		}
	}
	void returnBook(int count) {
		this.count = this.count + count;
		System.out.println(bookName + " : " + count + "�� �ݳ�");
		printBookCount();
	}
}
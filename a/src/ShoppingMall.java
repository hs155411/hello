
public class ShoppingMall {
	String code;
	static int total;
	
	ShoppingMall() {}
	
	ShoppingMall(String code) {
		this.code = code;
	}
	
	void addTotal(int Quantity ) {
		total += Quantity;
		System.out.println(Quantity + "�� �԰�. �ܿ� ����: " + total + "��");
	}
	void subTotal(int Quantity) {
		total -= Quantity;
		System.out.println(Quantity + "�� ���. �ܿ� ����: " + total + "��");
	}
	public static void main(String[] args) {
		ShoppingMall sp = new ShoppingMall();
		sp.code = "111";
		sp.addTotal(1);
		
		ShoppingMall sp2 = new ShoppingMall();
		sp2.code = "222";
		sp2.addTotal(1);
	}
}
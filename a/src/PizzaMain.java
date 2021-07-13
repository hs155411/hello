
public class PizzaMain {
	public static void main(String[] args) {
		Pizza p1 = new Pizza();
        p1.setKind("슈퍼슈림프");
        p1.setSize(12);
        Pizza p2 = new Pizza("포테이토");
        p2.setSize(24);
        Pizza p3 = new Pizza("불고기", 12);

        p1.toPrint();
        p2.toPrint();
        p3.toPrint();
	}
}
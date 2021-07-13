
public class TV_Shopping extends ShoppingMall {
	String time;
	
	TV_Shopping(String code, int total, String time) {
		this.code = code;
		this.total = total;
		this.time = time;
	}
	public static void main(String[] args) {
		TV_Shopping tv = new TV_Shopping("ABC123", 10, "12½Ã 30ºÐ");
		
	}
}
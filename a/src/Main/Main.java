package Main;

import form.a_login;

public class Main {
	public static void main(String[] args) {
		try {
			DB.DB.DBC();
			DB.DB.st.execute("use 2021Áö¹æ_1");
			new a_login();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DB {
	public static Connection ct;
	public static Statement st;
	
	public static ResultSet rs(String t) throws SQLException {
		DBC();
		st.execute("use 2021지방_1");
		return st.executeQuery(t);
	}
	
	public static void DBC() throws SQLException {
		ct = DriverManager.getConnection("jdbc:mysql://localhost/?serverTimezone=UTC&allowLoadLocalInfile = true", "root", "1234");
		st = ct.createStatement();
	}
	
	public static void DBS() throws SQLException {
		try {
			st.execute("drop database 2021지방_1");
			st.execute("drop user'user'@'localhost'");
		} catch (Exception e) {
			// TODO: handle exception
		}
		st.execute("create database 2021지방_1");
		st.execute("use 2021지방_1");
		st.execute("set global local_infile = 1");
		try {
			st.execute("create user'user'@'localhost' identified by '1234'");
			st.execute("grant select, insert, update, delete on 2021지방_1 * to user'user'@'localhost'");
		} catch (Exception e) {
			// TODO: handle exception
		}
		st.execute("create table user(u_no int primary key not null auto_increment, u_id varchar(20), u_pw varchar(20), u_name varchar(15), u_phone varchar(20), u_age date, u_10percent int, u_30percent int)");
		st.execute("create table category(c_no int primary key not null auto_increment, c_name varchar(10))");
		st.execute("create table product(p_no int primary key not null auto_increment, c_no int, p_name varchar(20), p_price int, p_stock int, p_explananation varchar(150), constraint foreign key(c_no) references category(c_no))");
		st.execute("create table purchase(pu_no int primary key not null auto_increment, p_no int, pu_price int, pu_count int, coupon int, u_no int, pu_date date, constraint foreign key(p_no) references product(p_no), constraint foreign key(u_no) references user(u_no))");
		st.execute("create table attendance(a_no int primary key not null auto_increment, u_no int, a_date date, constraint foreign key(u_no) references user(u_no))");
		st.execute("create table coupon(c_no int primary key not null auto_increment, u_no int, c_date varchar(15), c_10percent int, c_30percent int, constraint foreign key(u_no) references user(u_no))");
		
		String s[] = {"user", "category", "product", "purchase", "attendance", "coupon"};
		for (int i = 0; i < s.length; i++) {
			String path = "datafile/" + s[i] + ".txt";
			st.execute("load data local infile '" + path + "' into table " + s[i] + " ignore 1 lines ");
		}
	}
	public static void main(String[] args) {
		try {
			DBC();
			DBS();
			JOptionPane.showMessageDialog(null, "셋팅 성공", "정보", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "셋팅 실패", "경고", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
}
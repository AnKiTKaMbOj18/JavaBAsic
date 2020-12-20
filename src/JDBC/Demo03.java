package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo03 {
	public static void main(String[] args) {

		// JDBC example to store image in the database
		String driverString = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query = "insert into image values(?,?)";
		try {
			Class.forName(driverString);
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "pic1");

			FileInputStream pi = new FileInputStream("C:\\Users\\ba29602\\Downloads\\walk.jpg");
			ps.setBinaryStream(2, pi, pi.available());
			int i = ps.executeUpdate();
			System.out.println(i + "records updated");

			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

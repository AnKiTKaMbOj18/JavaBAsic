package JDBC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo04 {
	public static void main(String[] args) {

		// JDBC example to retrieve/fetch image from the database
		String driverString = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query = "select * from image";
		try {
			Class.forName(driverString);
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Blob b = rs.getBlob(2); // 2 means second column data
				byte[] barr = b.getBytes(1, (int) b.length()); // 1 means first image
				FileOutputStream fout = new FileOutputStream("C:\\Users\\ba29602\\Downloads\\sonno.jpg");
				fout.write(barr);
				fout.close();
			}
			System.out.println("ok");

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

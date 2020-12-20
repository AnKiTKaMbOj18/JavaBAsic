package JDBC;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo05 {
	public static void main(String[] args) {
		// JDBC example to store file in the database
		String driverString = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query = "insert into fileTable values(?,?)";

		try {
			Class.forName(driverString);
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement ps = con.prepareStatement(query);

			File file = new File("C:\\Users\\ba29602\\Desktop\\Bazaarvoice_docs.txt");
			FileReader fr = new FileReader(file);
			ps.setInt(1, 101);
			ps.setCharacterStream(2, fr, file.length());
			int i = ps.executeUpdate();
			System.out.println(i + " records updated");

			ps.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package JDBC;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo06 {

	public static void main(String[] args) {
		// JDBC example to retrieve/fetch file from the database
		String driverString = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query = "select * from fileTable";

		try {
			Class.forName(driverString);
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			rs.next(); // now pointer on the first row
			Clob c = rs.getClob(2); // 2 means second column data
			Reader reader = c.getCharacterStream();

			FileWriter fwriter = new FileWriter("C:\\Users\\ba29602\\Desktop\\BV_docs.txt");
			int i;
			while ((i = reader.read()) != -1)
				fwriter.write(i);
			fwriter.close();
			rs.close();
			ps.close();
			con.close();
			System.out.println("success");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

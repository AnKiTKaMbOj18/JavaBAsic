package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. import java.sql.*;
 * 2. Load and Register the driver - com.mysql.jdbc.Driver
 * 3. Create connection
 * 4. Create a statement
 * 5. Execute the query
 * 6. Process the results
 * 7. Close
 * 
 */

public class Demo01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pass = "Password@123";
		String query = "select username from student where userid=3";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("username");
		String uName = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		System.out.println(uName);

		// select all data from database
		ResultSet resultSet = st.executeQuery("select * from student");
		StringBuilder builder = new StringBuilder("");
		while (resultSet.next()) {
			builder.append(resultSet.getInt(1) + " : " + resultSet.getString(2)).append("\n");
		}
		System.out.println(builder);

		// To test below code snippet's uncomment one at a time

		// To insert data into database
		// int count = st.executeUpdate("insert into student values (5,'lucy')");
		// System.out.println(count);

		// To update data in database
		// int count = st.executeUpdate("update student set username='Lucie' where
		// userid=5");
		// System.out.println(count);

		// To delete data from database
		// int count = st.executeUpdate("delete from student where userid=5");
		// System.out.println(count);

		// Prepared Statement Example
		String quString = "insert into student values (?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(quString);
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "Lucy");

		// int count = preparedStatement.executeUpdate();
		// System.out.println(count);

		st.close();
		con.close();
	}

}

package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverQuery = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query1 = "insert into user1 values(?,?,?)";

		try {
			Class.forName(driverQuery);
			Connection con = DriverManager.getConnection(url, uname, password);
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement(query1);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("enter id");
				int id = Integer.parseInt(br.readLine());

				System.out.println("enter name");
				String name = br.readLine();

				System.out.println("enter salary");
				int salary = Integer.parseInt(br.readLine());

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.executeUpdate();

				System.out.println("want you commit y/n");
				String cmessage = br.readLine();

				if (cmessage.startsWith("y")) {
					con.commit();
					System.out.println("transaction commited successfullly, commited (-_-) ");
				} else if (cmessage.startsWith("n")) {
					con.rollback();
					System.out.println("transaction aborted, rollback..");
				}

				System.out.println("do you add more records y/n");
				String ans = br.readLine();

				if (!ans.startsWith("y")) {
					System.out.println("loop breaks");
					break;
				}
			}

			con.commit();
			System.out.println("Records updated successfully");
			con.close(); // before closing connection commit() is called

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

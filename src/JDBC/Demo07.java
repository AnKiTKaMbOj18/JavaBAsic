package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Transaction Management in JDBC - 
 * Transaction represents a single unit of work.
 * The ACID properties describes the transaction management well. ACID stands for Atomicity ,
  	Consistency, isolation and durability.

 * Atomicity means either all successful or none.
 * Consistency ensures bringing the database from one consistent state to another consistent state.
 * Isolation ensures that transaction is isolated from other transaction
 * Durability means once a transaction is committed it will remain so, even in the event of error, power loss etc.
 * 
 * Advantage of Transaction Management -
 * fast performance It makes the performance fast because database is hit at the time of commit.
 */

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverQuery = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "Password@123";
		String query1 = "insert into user values(103,'omax')";
		String query2 = "insert into user values(104,'luke')";

		try {
			Class.forName(driverQuery);
			Connection con = DriverManager.getConnection(url, uname, password);
			con.setAutoCommit(false);
			Statement st = con.createStatement();

			st.executeUpdate(query1);
			st.executeUpdate(query2);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("do you want to commit y/n");
			String ans = br.readLine();
			if (ans.startsWith("y")) {
				con.commit();
				System.out.println("record commited successfully");
			} else {
				con.rollback();
				System.out.println("transaction aborted i.e rollback");
			}

			st.close();
			con.close();
			System.out.println("ok, close");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

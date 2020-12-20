package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02DAO {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(4);
		System.out.println(s1.sname);
	}
}

class StudentDao {
	public Student getStudent(int rollno) {
		String query = "select username from student where userid=" + rollno;
		Student s = new Student();
		s.rollno = rollno;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Password@123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String sname = rs.getString(1);
			s.sname = sname;
			return s;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

class Student {
	int rollno;
	String sname;
}
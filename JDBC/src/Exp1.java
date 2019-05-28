import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Hibernate1","sa","");
		Statement stmt=conn.createStatement();
		int rr=10;
		//insert,update,delete,create,drop,alter
		int x=stmt.executeUpdate("insert into student values(1,'"+rr+"','Java Core')");
		
		//Select
		ResultSet rs=stmt.executeQuery("SELECT CUST_EMAIL,cust_name FROM CUSTOMER");
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
	}

}

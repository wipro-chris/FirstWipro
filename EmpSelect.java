

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpSelect {

	public static void main(String[] args) {
		
		
		//Establish Connection
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1522:orcl";
		String uname="scott";
		String pwd="tiger";
		try {
			con=DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create a Statement Object
		try {
			Statement st=con.createStatement();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter customer_id to be selected");
			String customer_id=scan.nextLine();
			
			String sql="select * from customdata3 where customer_id="+customer_id;
			System.out.println(sql);
			ResultSet rs=st.executeQuery(sql);
			boolean flag=false;
			while (rs.next())
			{
				flag=true;
				System.out.println("customer_id="+rs.getInt("customer_id"));
				System.out.println("customer_name="+rs.getString("customer_name"));
				System.out.println("dob="+rs.getInt("dob"));
				System.out.println("Address="+rs.getString("address"));
				System.out.println("email_address="+rs.getString("email_address"));
				System.out.println("contact_number="+rs.getInt("contact_number"));
			}
			
			if (!flag)
			System.out.println("Record not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

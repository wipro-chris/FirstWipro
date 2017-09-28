import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class custDelete {


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
			System.out.println("Enter customer_id to be deleted");
			int customer_id=scan.nextInt();
			String sql="delete from customdata3 where customer_id=" + customer_id;
			System.out.println(sql);
			scan.close();
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Record deleted");
			else
				System.out.println("Record not deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}



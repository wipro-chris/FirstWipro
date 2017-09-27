import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //open scanner
		
		System.out.println("What is your gender? Male or Female?"); //prompt user for input
		String gender = scanner.nextLine(); //store input from the user in variable gender
		
		System.out.println("How old are you?"); //prompt user for input
		int age = scanner.nextInt();//store next input from the user in variable age
		
		scanner.close(); //close scanner
		
			if (gender == "female") { 	//if string gender equals female, complete next statement
				if (age <= 58)			//if age is less than 58 do the following
			{
				System.out.println("The interest rate is 8.2%");
			}							// if it isnt less than 58 then print below statement
				else System.out.println("The interest rate is 7.6%"); 
				
			}	
			else if (gender == "male") { //the other string value should equal male
				if (age <= 60)	{ 
				System.out.println("The interest rate is 9.2%");
			}
				else System.out.println("The interest rate is 8.3%");
			
			}
	}

}

import java.util.Scanner;


public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//promt user for an input
		System.out.println("Enter a number between 1-12 to display the appropriate month");
		Scanner scanner = new Scanner(System.in); //open scanner
		int month = scanner.nextInt(); //next integer inputted is stored in month variable
		scanner.close(); //close scanner
		

	    switch(month) //go through each value looking for a case match
	    {
		    case 1:// if month == 1 go though statement
		        System.out.println ("The name of month is January"); //print month
		        break; //end of statement
		    case 2:
		        System.out.println ("The name of month is February");
		        break;
		    case 3:
		        System.out.println ("The name of month is March");
		        break;
		    case 4:
		        System.out.println ("The name of month is April");
		        break;
		    case 5:
		        System.out.println ("The name of month is May");
		        break;
		    case 6:
		        System.out.println ("The name of month is June");
		        break;
		    case 7:
		        System.out.println ("The name of month is July");
		        break;
		    case 8:
		        System.out.println ("The name of month is August");
		        break;
		    case 9:
		        System.out.println ("The name of month is September");
		        break;
		    case 10:
		        System.out.println ("The name of month is October");
		        break;
		    case 11:
		        System.out.println ("The name of month is November");
		        break;
		    case 12:
		        System.out.println ("The name of month is December");
		        break;
		    default:
		            System.out.println ("Error"); //if user enters invalid number print this
	}

}
}
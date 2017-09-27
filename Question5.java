import java.util.Scanner; //import scanner


public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number"); //Print message to user
		Scanner scanner = new Scanner(System.in); //open scanner class
		
		int number = scanner.nextInt(); //Tell the scanner to store the next integer in variable number
		
		if (number > 0) { //if the number entered is greater than one proceed
			System.out.println("The number is positive");
		}
		
		else if (number == 0){//if the number is equal to 0 proceed
				System.out.println("The number is 0");
		}
		else if (number < 0) { //if the number is less than 0 proceed
			System.out.println("The number is negative");
		}
		else System.out.println("Error"); //if there is any other value, print an error
		scanner.close(); //close scanner
	}
		
}

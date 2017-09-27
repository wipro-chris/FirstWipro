import java.util.Scanner;


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //open scanner
		
		
		System.out.println("Please enter a value: "); //prompt user to enter a value
		
		int number = scanner.nextInt(); //scanner takes next integer entered
		
		System.out.println("Please enter a second value: ");
		
		int number2 = scanner.nextInt(); //scanner takes next integer entered
		
		 for (int i=number; i < number2; i++) { //set I to value of first number entered
			 									//whilst I is less than number 2
			 									//Increment I by one each time
			 if (i % 2 == 0){					//Mod i by 2 to find remainder
				 System.out.println(i+ " ");	//if number has no remainder, print it
				 
		scanner.close(); //close scanner
			 }

		 }
	}
}
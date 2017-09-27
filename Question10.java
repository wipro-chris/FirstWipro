import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // open scanner

		System.out.println("Enter a number to see if it is a palindrome");

		int number = scanner.nextInt(); // store next integer in varible
										// 'number'
		scanner.close(); // close scanner

		String nextnumber = Integer.toString(number); // convert number to
														// string
		String reverse = new StringBuilder(nextnumber).reverse().toString(); // reverse
																				// 'nextnumber'

		if (reverse.equals(nextnumber)) { // checks whether strings match
			System.out.println("This number is a palindrome"); // if they do the
																// string is
																// palindrome

		}

		else
			System.out.println("This number is not a palindrome");
		{ // if they don't, print this

		}
	}

}

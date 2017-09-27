import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2; //set to integer variables 
		String option; //set string for user option later

		boolean menu = true; //intialise the menu value as true

		while (menu == true) { //while this statement is true do the followoing
			System.out.println("Menu\n1.Add\n2.Sub\n"); // Print menu, the '\n1.' signifies new line
			Scanner scanner = new Scanner(System.in); //open scanner
		
			int number = scanner.nextInt(); //user selects menu choice for add
			if (number == 1) {
				System.out.println("Type two numbers to be added together");
				num1 = scanner.nextInt(); 
				num2 = scanner.nextInt(); //scanner takes two values to add together
				System.out.println("The two numbers added together equal "
						+ (num1 + num2)); //add them together and print result
				System.out.println("Do you want to continue?");
				scanner.next(); 
				option = scanner.nextLine(); //scanner takes next character
				if (option.equals("y") || option.equals("Y")) { 
					continue; //if the input matches either of the values then return to menu
				} else if (option.equals("n") || option.equals("N")) {
					System.out.println("Bye!");
					menu = false; //if not return false
				}
			}

			else if (number == 2) { //user selects option for subtraction
			System.out.println("Type two numbers to be subtracted from each other");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();//take next integers to subtract from each other
				System.out.println("The two numbers subtracted together equal "
						+ (num1 - num2));//subtract the numbers
				scanner.nextLine();
				System.out.println("Do you want to continue?");
				option = scanner.nextLine(); //take option variable from user
				if (option.equals("y") || option.equals("Y")) {
					continue; //continue if input matches 'y' 'Y'
				} else if (option.equals("n") || option.equals("N")) {
					System.out.println("Bye!");
					menu = false;
					scanner.close(); //close scanner
				}
			}
		}
		
	}
}
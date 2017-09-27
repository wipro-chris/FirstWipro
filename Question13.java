import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 1, 2, 50, 8, 6, 5, 4, 3, 1, 2 }; // [] intialize array
															//enter
															// numbers for array

		int min = Arrays.stream(number).min().getAsInt(); // Look in the array
															// number, find min
															// number
		int max = Arrays.stream(number).max().getAsInt(); // look in the array
															// for max number
		System.out.println("The minimum number in the given array is: " + min);
		System.out.println("The maximum number in the given array is: " + max); // print
																				// both
																				// statements

	}

}

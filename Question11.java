public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; // this is the number that is modded by 2,3,5
		int count = 0;// original counter starts at 0

		while (count < 5) // while count is less than five do the if statement
		{
			if (i % 3 == 0 && i % 2 == 0 && i % 5 == 0) // if you divide by each
														// number the remainder
														// is 0
			{
				System.out.println(i); // print current value for i
				count++;// increase the count by one if statement is correct
			}
			i++; // increase i by one each time

		}

	}

}

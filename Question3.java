
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = args[0];
		String str2 = args[1];
		
		String reverse = new StringBuilder(str2).reverse().toString();
		
		System.out.println(str1 + " " + reverse);
	}

}

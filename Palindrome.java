package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "madam";
		String rev = " ";
		//char[] eachWord = word.toCharArray();
		System.out.println("word:"+word);
		for (int i = word.length()-1;i>=0;i--) {
			
			rev = rev + word.charAt(i);
			
		}
		
		System.out.println("Reverse word:"+rev);
		
		if (word.equalsIgnoreCase(rev)) {
			
			System.out.println("Palindrome");
			
		} else {
			
			System.out.println("Not a Palindrome");

		}

	}

}

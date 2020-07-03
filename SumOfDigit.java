package week1.day1;

public class SumOfDigit {
	
	public static void main(String[] args) {
		int a=8789798 , sum = 0;
		
		while(a>0)
		{
			int lastDigit = a % 10;
			sum = sum + lastDigit;
			a = a/10;
			System.out.println("Sum: "+ sum + " Remaining Number:" + a);
			
		}
		
		System.out.println("Sum of digits:" + sum);
		
	}

}

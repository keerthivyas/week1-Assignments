package week1.day1;

public class FibonacciSeries {
    
	public static void main(String[] args) {
		
		int a=0, b=1, range=20;
		
		for (int i = 1; i <= range ; i++) {
			System.out.println(a);	
			int c= a+b;
			a=b;
			b=c;
		}
		
		
				
	}
	
	
}

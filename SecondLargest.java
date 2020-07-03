package week1.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	
		int[] data = {3,2,11,4,6,7,786};
		System.out.println(" Values:");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			}
		
		Arrays.sort(data);
		System.out.println(" After Sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			}
		
		int secondLargest = data.length-2;
		
		System.out.println("Second Largest: "+ data[secondLargest]);
		

}
}
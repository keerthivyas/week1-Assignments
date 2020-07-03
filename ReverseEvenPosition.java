package week1.day1;

public class ReverseEvenPosition {
	
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] split = test.split(" ");
		System.out.println("Current text: "  + test);
		System.out.println("Current text Length: " +split.length);
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			}
		String revString = " ";
		for (int i = 0; i < split.length; i++) {
			String eachWord= split[i];
			String revWord=" ";
			if (i%2 != 0) {
				
				for (int j = eachWord.length()- 1; j >=0; j--) {
					revWord = revWord + eachWord.charAt(j);		
					
				}
				
				revString = revString + revWord + " ";
				
			} else {
                  
				revString = revString + eachWord + " ";
			}
			
		//	System.out.println(outString);
		}
		
		
		
		System.out.println("Reverse Text : " + revString);
		
	}

}

package week1.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int a = 0;
		String[] split = text.split(" ");
		String withoutDuplicate = " ";
		
		for (int i = 0; i < split.length; i++) {
			
			for (int j = 0; j < split.length; j++) {
				
				if (split[i].equals(split[j])) {
					
					a=a+1;
					
				}
				
			}
			if (a>1) {
				withoutDuplicate = withoutDuplicate + split[i].replace(split[i], " ");
				
			}else {
				withoutDuplicate = withoutDuplicate + split[i] + " ";
			}
			a = 0;
		}
     System.out.println(withoutDuplicate);
	}

}

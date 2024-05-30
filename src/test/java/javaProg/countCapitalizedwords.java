package javaProg;

public class countCapitalizedwords {
	
	//Write a Java Program to get the count of Capitalized words in a String.
	
	
	public static int countCap(String inputString) {
		int count=0;
		
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z') {
				count++;
			
		
			}
			
		}
		return count;	
		
	}
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countCap("KamAlMiShRA"));
		
		
		

	}

}

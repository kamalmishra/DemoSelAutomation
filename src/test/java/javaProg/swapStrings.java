package javaProg;

public class swapStrings {
	//Write a Java Program to swap two given Strings

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1="kamal";
   String s2="mishra";
   
   s1=s1+s2;
   
   s2=s1.substring(0,s1.length()-s2.length());
   s1=s1.substring(s2.length());
   
   System.out.println("s1="+s1);
   System.out.println("s2="+s2);
	}

}

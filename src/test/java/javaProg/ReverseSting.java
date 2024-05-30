package javaProg;

public class ReverseSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to reverse a String.
		
		String inputString="mishra";
		String outPutSting="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			outPutSting=outPutSting+inputString.charAt(i);
		}
        System.out.println(outPutSting);
	}

}

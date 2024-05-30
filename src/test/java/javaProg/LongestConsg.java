package javaProg;

public class LongestConsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to find the longest consecutive occurrence of integers in a given array
		
		int a[]= {2,3,2,4,5,6,9,10,34,35};
		int count=0;
		int max=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]+1==a[i+1]) {
				
				count++;
			}else {
				count=0;
			}
			max=Math.max(max, count+1);
		}
		System.out.println(max);

	}

}

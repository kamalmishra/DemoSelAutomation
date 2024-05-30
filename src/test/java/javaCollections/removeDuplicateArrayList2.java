package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="kamal";
		
		String[] st=s.split("");
		
		ArrayList<String> strList=new ArrayList<String>(Arrays.asList(st));
		

		System.out.println(strList.toString());
		
		Set<String> l=new LinkedHashSet<String>(strList);
		System.out.println(l);
		
		

	}

}

package javaCollections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> st=new ArrayList<String>();
		
		st.add("kamal");
		st.add("opus");
		st.add("cap");
		st.add("cog");
		st.add("tcs");
		st.add("worline");
		st.add("worline");
		
		System.out.println(st.toString());
		
		
		Set<String> l=new LinkedHashSet<String>(st);
		System.out.println(l);
		
		

	}

}

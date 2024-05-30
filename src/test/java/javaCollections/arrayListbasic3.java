package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListbasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declearation---public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable 	
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add("kamal");
		st.add("opus");
		st.add("cap");
		st.add("cog");
		st.add("tcs");
		st.add("worline");
		st.add("worline");
		st.set(2, "mother");
		
		System.out.println(st);	
		
		System.out.println(st.get(2));	
		
	for(String list:st) {
		 System.out.println(list);	
		 
		 
		 
	}
		
		
		

	}

}

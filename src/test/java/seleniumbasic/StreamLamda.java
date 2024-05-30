package seleniumbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamLamda {

	
	  @Test
	  
	  public void regular() {
	  
	  ArrayList<String> name=new ArrayList<String>(); name.add("kamal");
	  name.add("aman"); name.add("baby"); name.add("foot"); name.add("kumar");
	  name.add("mishra"); name.add("kamlesh"); int count=0;
	  
	  for(int i=0;i<name.size();i++) { String actual=name.get(i);
	  
	  if(actual.startsWith("k")) { count++; } } System.err.println(count); }
	 

	@Test
	public void stream() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("kamal");
		name.add("aman");
		name.add("baby");
		name.add("bou");
		name.add("kumar");
		name.add("mishra");
		name.add("kamlesh");

		Long l = name.stream().filter(s -> s.startsWith("b")).count();
		System.err.println(l);

		
		  Long d=Stream.of("abhi","mulay","ananf","afsans").filter(s->{
		  s.startsWith("a"); return true; }).count();
		  
		  System.err.println(d);
		 

		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

		name.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	
	  @Test public void streamMap() {
	  
	  ArrayList<String> name = new ArrayList<String>(); name.add("kamal");
	  name.add("aman"); name.add("baby"); name.add("bou"); name.add("kumar");
	  name.add("mishra"); name.add("kamlesh");
	  
	  
	  Stream.of("abhier","mulayer","ananfr","afsandds","elfgrrtt").filter(s->s.
	  endsWith("r")).map(s->s.toUpperCase()). forEach(s->System.out.println(s));
	 
	  
	  List<String>
	  name1=Arrays.asList("abhier","mulayer","ananfr","afsandds","elfgrrtt");
	  name1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).
	  forEach(s->System.out.println(s));
	  
	  Stream<String> ab= Stream.concat(name.stream(), name1.stream());
	  
	  //ab.sorted().forEach(s->System.out.println(s)); 
	  boolean flag=ab.anyMatch(s->s.equalsIgnoreCase("kamlesh")); 
	  System.out.println(flag);
	  Assert.assertTrue(flag);
	  
	  
	  }
	 
	@Test

	public void streamCollect() {

		List<String> li = Stream.of("abhier", "mulayer", "ananfr", "afsandds", "elfgrrtt").filter(s -> s.endsWith("r"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(li.get(0));
		
	List<Integer>	ls=Arrays.asList(2,5,6,8,3,2,2,7,8,8,20);
	ls.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> df=ls.stream().distinct().sorted().collect(Collectors.toList());
	
	System.out.println(df.get(2));

	}

}

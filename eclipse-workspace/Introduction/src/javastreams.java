import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("AJjay","Zainua","1","Rama","6a");
		//names.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		//System.out.println(c);
		//names.stream().filter(s->s.length()>3).limit(2).forEach(s->System.out.println(s));
		
//Stream.of("AJjay","Zainua","1","Rama","6a").filter(s->s.startsWith("6")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

List<String> names1=Arrays.asList("Rushali","Rahul","Anakmia","yews","xeab");
Stream<String> newstream=Stream.concat(names.stream(), names1.stream());
//Stream<String> sstream=newstream.filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase());
//boolean flag=sstream.anyMatch(s->s.equalsIgnoreCase("6A"));
//System.out.println(flag);
//Assert.assertTrue(flag);

List<String> newlist=newstream.collect(Collectors.toList());
String sl=newlist.get(2);
System.out.println(sl);

List<Integer> li=Arrays.asList(2,4,5,3,2,4,5,5,7);
List newlist = li.stream().distinct().sorted().collect(Collectors.toList());





		
		
		
		
		
	}

}

package day17Set;
import java.util.*;
public class Sets2 {

	public static void main(String[] args) {
		HashSet<String> x= new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("aa");
		x.add("bb");
		x.add("cc");
		System.out.println(x);// SET doesnot allow duplication values
		
		x.addAll(Arrays.asList("ab","bc","cd"));
		System.out.println(x);
		
		for(String y:x)
		{
			System.out.println(y);// we cannt have index in set so we cannot use get function 
			// as index value is not there in set like poistion 0,1 it uses on;y random memory
			//so we cannot use for loop and use get function
		}

		System.out.println(x.size());// returns size of set
		
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("aaa")); // check if values are there
		
		System.out.println(x.containsAll(Arrays.asList("aa","bb","cc"))); // checks multiple values if any values of that multiple value is not present it returns false
		
		System.out.println(x.isEmpty());// check if set is empty
	}

}

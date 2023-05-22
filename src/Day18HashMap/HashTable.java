package Day18HashMap;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>sd=new Hashtable<>(); // The difference between HashMap and HashTableis that Hashtabklle does not allw null values
		sd.put(1, "abc");
		sd.put(2, "lavanya");
		sd.put(3, "cde");
		sd.put(null, "pol");//HASHTABLE does not allow NULL keys
		sd.put(101, null);//HashTable does not allow NULL values
		// null thorws null pointer exception while compiling
		System.out.println(sd);
		

	}

}

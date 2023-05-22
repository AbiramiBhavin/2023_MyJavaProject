package Day18HashMap;
import java.util.*;

public class HashMapss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>sd=new HashMap<>(); //This stores complete info about one entity
		// On the above int is key and string is values
		sd.put(101, "ABI");// this put is used to add values to HashMap
		sd.put(102, "bavin");
		sd.put(103, "lakshu");
		System.out.println("After Adding the values");
System.out.println(sd);
		System.out.println("To display the keys");
		System.out.println(sd.keySet());// displays all key in the hasmap
		System.out.println("To display the values");
		System.out.println(sd.values());// displays all values in the Hashmap
		System.out.println("To display key along with values");
		System.out.println(sd.entrySet()); // display key along with values
		System.out.println("To check if the key is present or not");
		System.out.println(sd.containsKey(101));// checks if 101 key is present
		System.out.println(sd.containsKey(104));
		System.out.println("To check if the value is present or not");
		System.out.println(sd.containsValue("ABI"));// checks if value ABI is present
		System.out.println(sd.containsValue("lakshu"));
		System.out.println("To check the size of hashmap");
		System.out.println(sd.size());//checks the size of Hashmap
		System.out.println("To remove the key");
		sd.remove(101);
		System.out.println("To remove the key along with value");
		sd.remove(101,"ABI");
		System.out.println("After removing");
		System.out.println(sd);
		System.out.println("Adding new valuesss");
		sd.put(102, "bavu");//new key it will add or if exist key replace
		
		System.out.println(sd);
		
		sd.replace(104, "ddd");//new key it will not add or if exist key replace
		
		System.out.println("Replacing with new value");
		sd.replace(102, "bavu", "abc");
		
		System.out.println(sd);
	


		
		

	}

}

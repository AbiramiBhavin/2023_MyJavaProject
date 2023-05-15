package day17Set;
import java.util.*;
public class sets {

	public static void main(String[] args) {
		
				ArrayList<String> a= new ArrayList<String>(); // Here it is list
				a.add("aa");
				a.add("bb");
				a.add("cc");
				a.add("aa");// List allows duplication values
				a.add("bb");
				a.add("cc");
				
				System.out.println(a);
				
				
				HashSet<String> x= new HashSet<>();// declration of set
				x.add("aa");
				x.add("bb");//SET doesnot allow duplication values
				x.add("cc");
				x.add("aa");
				x.add("bb");
				x.add("cc");
				System.out.println(x);
				
				
			}

		}

	



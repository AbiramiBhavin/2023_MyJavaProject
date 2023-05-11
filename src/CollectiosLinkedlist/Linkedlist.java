package CollectiosLinkedlist;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the List Size");
		int ls=sc.nextInt();
		
		// Linked list is one of the collection for storage of data
		LinkedList<Integer> a=new LinkedList<Integer>();// declaring linked list with obj a
		//In the place od integer above we can declare anydta type 
		
		/* ADDING VALUES TO THE LIST*/
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		/* to print in line by line of list values we use foreach function
		for(int y:a)
		{
			System.out.println(y);
		}
		*/
		
		
		/* for entering the values from user in list*/
		
		System.out.println("Enter the values");
		for(int j=0;j<ls;j++)
		{
			a.add(sc.nextInt());
		}
		
		//display values from user                                                                              
		System.out.println("display the values for the list");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));// this is used to display the values for list
		}
		// Declaring array and passing it to List
		Integer b[]= {100,200,300,400};
		System.out.println("the user defined array values");   
		for(int k=0;k<b.length;k++)
		{
		System.out.println(b[k]);
		}
		System.out.println(a);
		// To copy this new array to List we use asList function
		System.out.println("copied Valued");
		a.addAll(Arrays.asList(b));// This is used to convert Array to List uing asList function
		System.out.println(a);
		
		/* to insrt the new value at particulr position*/
		System.out.println("Adding two new values");
		a.add(2,35);//> this add function just adds yp the value before the existing value at that position
		System.out.println(a);
		a.addAll(2,Arrays.asList(10));
		System.out.println(a);
//To remove the value from the list at the particular position
		System.out.println("After removing");
 a.remove(2);
 a.remove(3); 
 System.out.println(a);
 
 // To remove the list of values in list
 a.removeAll(Arrays.asList(40,50,100));
 System.out.println("After removing list of values");
 System.out.println(a);
 
 LinkedList<Integer> c=new LinkedList<>();
 c.addAll(a);
 System.out.println("C values of new linkwd list");
 System.out.println(c);
  
 //To check if the values is present or not in the lList we use Contains function and it returns result as true or false
 System.out.println("Enter the value ot be checked");
 int v=sc.nextInt();
 if(a.contains(v)==true)
 {
	System.out.println("Value is present "); 
 }
 else
 {
	 System.out.println("value is not present");
 }
	}                                                                                 

}

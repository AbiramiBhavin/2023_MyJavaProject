package day16CollectiosLinkedlist;
import java.util.*;

public class diffbwaddandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<>();
		a.add(0,10);
		a.add(1,20);
		a.add(2,45);
		a.add(3,50);
		
		//this prints op 10,20,45,50
		System.out.println("Orginial value sin the list");
		System.out.println(a);
		System.out.println("After inserting the new value, values just gets inserted or shuffled");
		a.add(2,40);
		System.out.println(a);// This add function just inserts the value t the 2nd position just before the previous 2nd value
		
		a.set(1,500);// this doesnot shuffle values, instead it replaces the 1st poistion value 20 with 500
		System.out.println("Replacing the values");
System.out.println(a);
	}

}

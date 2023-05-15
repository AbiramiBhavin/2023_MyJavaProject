package day17Set;
import java.util.*;

public class Set3union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SET does not allow duplicte values
		//SET THEORY UNION, INTERSECTION, DIFFERENCE, 
		HashSet<Integer> x= new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		
		HashSet<Integer> y= new HashSet<>();
		y.add(4);
		y.add(5);
		y.add(6);
		y.add(7);
		y.add(8);
		
		System.out.println(x);
		System.out.println(y);
		
		HashSet<Integer> xUniony= new HashSet<>(x);
		xUniony.addAll(y);// addALL() unites the value of x and y
		System.out.println("Union Value is");
		System.out.println(xUniony);
		
		
		HashSet<Integer> xintersectiony= new HashSet<>(x);
		xintersectiony.retainAll(y);// retainAll() shows the common values of x and y
		System.out.println("Intersection");
		System.out.println(xintersectiony);
		
		HashSet<Integer> xdiffy= new HashSet<>(x);
		xdiffy.removeAll(y);// removeAll function removes the common value of y from x
		System.out.println("X-Y");
		System.out.println(xdiffy);
		
		
		HashSet<Integer> ydiffx= new HashSet<>(y);
		ydiffx.removeAll(x);// removes the common values of x from y
		System.out.println("Ý-X");
		System.out.println(ydiffx);
	}

}

	



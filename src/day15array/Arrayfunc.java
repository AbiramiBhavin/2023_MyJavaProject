package day15array;
import java.util.Arrays;
public class Arrayfunc {

	public static void main(String[] args) {
		// This program is to have user defined array size
		int x[]= {10,20,30,40,50,60};
		// To get the size of array we use length function
		System.out.println("The size of the array is");
		System.out.println(x.length);
		System.out.println("The values are:");
		System.out.println(Arrays.toString(x));
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("Array sorting");
		Arrays.sort(x);// This is used to print arrays in ascending order
		//.toString() is used to print array values in single line
		System.out.println(Arrays.toString(x));
		// to know the memory size we just print x 
		System.out.println("Memory size");
		System.out.println(x);
		//to copy the values to new array size
		System.out.println("Copying to new Array");
		int p[]=Arrays.copyOf(x,x.length);
		System.out.println(Arrays.toString(p));
		//changing a particular value n array
		 p[0]=100;
		p[1]=300;
		System.out.println("After change");
		System.out.println(Arrays.toString(p));

	}

}

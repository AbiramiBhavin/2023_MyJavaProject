package day15array;

import java.util.Scanner;

public class Arraysipfromuser {

	public static void main(String[] args) {
		// Arrays getting input from user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();// getting array size as ip from user
		int x[]=new int[n];// declaraing the array size
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the vaklues");
			x[i]=s.nextInt();// Geting ip for each values
		}
		System.out.println("FOR EACH LOOP");
		for(int y:x)
		{
			System.out.println(y); // assigning each value of x to y
		}
	}

}

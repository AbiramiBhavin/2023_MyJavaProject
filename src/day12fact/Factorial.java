package day12fact;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//FactoriL PGM
		System.out.println("FACTORIAL PROGRAM");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int n=scn.nextInt(); // to get printed to which no
		int a=1; // factorial starts with 1
		int temp=1; // we need one variable for multiplying a with so we use temp and we are using same variablefor storing
		while(a<=n)
		{
			temp=temp*a;
			System.out.println(a+" "+temp);
			a=a+1;
		}

	}

}

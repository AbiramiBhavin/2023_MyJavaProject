package day12fact;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//FIBBONACCI SRIES TO THE GIVEN NUMBER; 
		// the logic of fibonacci series  is it starts with 0 and 1
		// 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8 5+8= 13
		Scanner sc=new Scanner(System.in);
		System.out.println("till which length you want to have the fibonnaci series");
		int n=sc.nextInt();
		sc.close();
		int a=0;
		int b=1;
		int temp;
		int i=1;
		while(i<=n)
		{
			System.out.println(a);
			temp=a+b;// fibbonacci is addition of two prv numbers
			
		
		
		a=b; //aftr 1st iteration the value is resummed and we are assing a=1, and b with prev addi values
		b=temp; // and by this we are iterating till what we need
		i=i+1;
		}

	}

}

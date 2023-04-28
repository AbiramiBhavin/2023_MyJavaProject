package day11loopcntrl;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		// PGM to check the even no from the starrt range and end range (i.e) it prints all the range from start to end
		Scanner s=new Scanner(System.in);
		System.out.println("Start Range");
		int a=s.nextInt();
		System.out.println("End Range");
		int b=s.nextInt();
		while(a<=b)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a=a+1;
		}
		System.out.println("End of Pg");

	}

}

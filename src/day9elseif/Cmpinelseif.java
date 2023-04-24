package day9elseif;
import java.util.Scanner;

public class Cmpinelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program comparing three Numbers");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Value");
		int a=scanner.nextInt();
		System.out.println("Enter the second Value");
		int b=scanner.nextInt();
		System.out.println("Enter the third Value");
		int c=scanner.nextInt();
		scanner.close();
		if(a>b && a>c)
		{
			System.out.println("first value is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("second value is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("third value is greater");
		}
		else if(a==b && b==c)
		{
			System.out.println("Same values");
		}

	}

}

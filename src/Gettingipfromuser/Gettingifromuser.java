package Gettingipfromuser;
import java.util.Scanner;
public class Gettingifromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value of a");
		long a=scanner.nextLong();
		System.out.println("Enter Value of b");
		int b=scanner.nextInt();
		scanner.close();
		if(a%b==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		
		

	}

}

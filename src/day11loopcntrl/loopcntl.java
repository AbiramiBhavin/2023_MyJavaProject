package day11loopcntrl;
import java.util.Scanner;
public class loopcntl {

	public static void main(String[] args) {
	//program to demonstrate while loop multiples of 3 using while loop from st no to end no multiples of 3
		//3 to 10 => 3*3 4*3 5*3
		System.out.println("Enter the start range numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the end range");
		int c=sc.nextInt();
		while(a<=c)
		{
			System.out.println(a+"X"+3+"="+(a*3));
			a=a+1;
			
		}
		System.out.println("End of Pgm");
		/*while(xdvc>=a)
		{
			System.out.println(a+"X"+3+"="+(a*3));
			a=a+1;// in this case op will be infinite if i give a  as 2 and c as 20 and dec a a=a-1; op is infi
		}*/
		sc.close();
		
	}

}

package day10nestedif;
import java.util.Scanner;

// this is the program to check the availabitiy of mobile in mobile store using nested if

public class Egfornestif {

	public static void main(String[] args) {
		System.out.println(" Welcome to latest Mobile Store");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the brand");
		String br=s.next();// when only one string is used we use .nextLine() and multiple string .next() 
		int price;
		String color;
		if(br.equals("OPPO")||br.equals("VIVO")||br.equals("MI"))
		{
			System.out.println("Entered Mobile braand is available");
		if(br.equals("OPPO"))
			{
				System.out.println("Enter the price range");
				price=s.nextInt();
				if(price>=10000 && price<=100000) 
				{
					System.out.println("Enter the color");
					color=s.next();
					if(color.equals("red")||color.equals("silver"))
							{
						System.out.println("OPPO mobile is available");
							}
					else
					{
						System.out.println("OPPO mobile not avilable");
					}
				}
				else
				{
					System.out.println("No OPPO mobile is available for this price");
				}
			}
		if(br.equals("VIVO"))
		{
			System.out.println("Enter the price range");
			price=s.nextInt();
			if(price>=20000 && price<=120000) 
			{
				System.out.println("Enter the color");
				color=s.next();
				if(color.equals("black")||color.equals("blue"))
						{
					System.out.println("VIVO mobile is available");
						}
				else
				{
					System.out.println("VIVO mobile not avilable");
				}
			}
			else
			{
				System.out.println("No Vivo mobile is available for this price");
			}
		}
		if(br.equals("MI"))
		{
			System.out.println("Enter the price range");
			price=s.nextInt();
			if(price>=30000 && price<=130000) 
			{
				System.out.println("Enter the color");
				color=s.next();
				s.close();
				if(color.equals("red")||color.equals("black"))
						{
					System.out.println("MI mobile is available");
						}
				else
				{
					System.out.println("MI mobile not avilable");
				}
			}
		
			else
			{
				System.out.println("No MI mobile is available for this price");
			}
		}
		
		
		}
		
		else
		{
			System.out.println(" Entered Mobile brand Not avialble");
		}
		

	}

}


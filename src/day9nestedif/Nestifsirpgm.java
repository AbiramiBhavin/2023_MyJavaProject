package day9nestedif;
public class Nestifsirpgm {

	public static void main(String[] args) {
		System.out.println("Start Program...!");
		int a=0;
		int b=10;
		int c=1000;
		if(a>=b && a>=c)
		{
			if(a==b && a==c)
			{
				System.out.println("a,b & c are equal");
			}
			else if(a>=b && b>c)
			{
				if(a==b)
				{
					System.out.println("a & b are equal and greater than c");
				}
				else
				{
					System.out.println("a is greater than b, b is greater than c");
				}

			}
			else if(a>=c && c>b)
			{
				if(a==c)
				{
					System.out.println("a & c are equal and greater than b");
				}
				else
				{
					System.out.println("a is greater than c, c is greater than b");
				}
			}
			else
			{
				System.out.println("a is greater than b & c, b &c are equal");
			}
		}
		else if(b>=a && b>=c)
		{
			if(b>a && a>c)
			{
				System.out.println("b is greater than a, a is greater than c");
			}
			else if(b>=c && c>a)
			{
				if(b==c)
				{
					System.out.println("b & c are equal and greater than a");
				}
				else
				{
					System.out.println("b is greater that c and c is greater a");
				}
			}
			else
			{
				System.out.println("b is greater than a & c and a & c are equal");
			}
		}
		else
		{
			if(a>b)
			{
				System.out.println("c is greater than a and a is greater than b");
			}
			else if(b>a)
			{
				System.out.println("c is greater than b and b is greater than a");
			}
			else
			{
				System.out.println("c is greater than a & b and a & b are equal");
			}
		}


		System.out.println("End Program...!");

	}

}
package day14Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		/*for(int i=1;i<=1;i++)
		{
			System.out.print(i);// this prints 1 this loop executes only one time 1
		}
		System.out.println();
		for(int i=1;i<=2;i++)
		{
			System.out.print(i);// this prints 2 this loop executes only two time // nextline 12
		}
		System.out.println();*/
		// to print 12 in diff line we have these much lines of code to reduce lines of code we use nested for loop
		
		for(int x=1;x<=5;x++)
		{
			for(int i=1;i<=x;i++)// to execute the line of code and to bring the x value here 
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}

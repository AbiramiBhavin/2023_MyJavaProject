package day13nestedloop;

public class nestedloop {

	public static void main(String[] args) {
		// nested loop for while
		int a=1;
		while(a<=2)// this is the outer loop this loop runs for 2 runs
		{
			int b=1;
			while(b<=2) // this is inner loop and this runs for 2 runs
			{
				System.out.println("abc");
				b=b+1;
	
			}
			a=a+1;
		}
		// so totally the output of this program is 4 times the execution

	}

}

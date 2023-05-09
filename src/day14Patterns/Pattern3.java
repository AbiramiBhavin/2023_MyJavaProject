package day14Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*54321
 * 4321
 * 321
 * 21
 * 1
 */
		for(int x=5;x>=1;x--)
		{
			for(int a=x;a>=1;a--)
			{
				System.out.print(a);
			}
			System.out.println();
		}
	}

}

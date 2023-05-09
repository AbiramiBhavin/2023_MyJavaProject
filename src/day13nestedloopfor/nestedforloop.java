package day13nestedloopfor;

public class nestedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=3;i++)// This is the program for nested for loop this loop will have 3 runs and the inner loop has 3 runs
{
	for(int j=1;j<=3;j++)// so totally 9 (3*3) if 4 there then (4*4) runs
	{
		System.out.println("123");
	}
}
for(int a=1;a<=3;a++)// this runs for 3 times
{
	for(int b=1;b<=a;b++)// this runs for 2 times
	{
		System.out.println("4253"); // this runs for 3*2=6 times
	}
}
for(int a=1;a<=3;a++)// this runs for 3 times
{
	for(int b=a;b<=a;b++)// this runs for 1 times a=2 and this value is assigned to b 2<=2 loop exe n checks for 1 time
	{
		System.out.println("4253"); // this runs for 3*1=3 times
	}
}
	}

}
//


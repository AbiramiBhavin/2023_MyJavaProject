package day4inh.packageA;

public class accclass {

	public static void add(int e, int f)
	{
		System.out.println("ADDhs is");
		System.out.println(e+f);
	}
	private static void sub(int g, int h) // Private accesses only in the class
	{
		System.out.println("SUB is");
		System.out.println(g-h);
	}
	protected static void mul(int k, int l)
	{
		System.out.println("mul is");
		System.out.println(k*l);
	}
	static void div(int m, int n)
	{
		System.out.println("div is");
		System.out.println(m/n);
	}
	

}

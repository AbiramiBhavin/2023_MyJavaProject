package day5Overload;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pgm3 o= new Pgm3();
o.main(5, 9f);
o.main(2,7l,4);
	}
	void main(int a, float b)
	{
		System.out.println("MUL IS ");
		System.out.println(a*b);
	}
	long main(int c,long d,int e)
	{
		System.out.println("ADD is");
		System.out.println(c+d+e);
		return c+d+e;
	}

}

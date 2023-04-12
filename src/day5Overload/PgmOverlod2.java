package day5Overload;

public class PgmOverlod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PgmOverlod2 t=new PgmOverlod2();
		
cube(5);
cube(4,6f);
	}
public static int cube(int c)
{
	System.out.println("vol of cube");
	System.out.println(c*c*c);
return c*c*c;
}// In this pgm Overloaded the method rect with diff argument 
public static float cube (int p, float q)
{
	System.out.println("Volume of cube");
	System.out.println(p*q);
	return p*q;
}
}

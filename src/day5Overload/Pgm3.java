package day5Overload;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pgm3 o= new Pgm3();
o.main((byte)1,(byte)3);
o.main((short)2,(byte)7,(short)4); // since java executes highest data type we need to typecast the int vales 1,3,2 as byte and Short respectively
	}
	void main(byte a,short b) // byte and short cannot be overloaded as we are passing int values and while exe compiler chooses the highest memory first that is int valkues 
	{
		System.out.println("MUL IS ");
		System.out.println(a*b);
	}
	void main(short c,byte d,short e)
	{
		System.out.println("ADD is");
		System.out.println(c+d+e);
		//return c+d+e;
	}

}


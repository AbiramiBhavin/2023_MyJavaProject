package day5Overload;

public class PgmOverlod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	PgmOverlod p=new PgmOverlod();
	cubeVol(3);
	p.cubeVol(9,6f);

	}
	public static void cubeVol(int a)
	{
		System.out.println("Volume of cube:");
		System.out.println(a*a*a);
	}// Here overloaded CubeVol method with different arguments and different access specifier and accessed non static through object
	protected void cubeVol(int a,float b) 
	{
		System.out.println("Volume of cube:");
		System.out.println(a*b);
	}
	

}

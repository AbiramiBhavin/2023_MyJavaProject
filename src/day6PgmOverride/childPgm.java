package day6PgmOverride;

public class childPgm extends OverridePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	@Override
	public void cube(int a, int b) // here we need to give annotation @Override to let java know we are using same methodname and same parameters but diff content inside method
	{
		System.out.println("Child Class Program");
		System.out.println("Volume of cuboid");
		System.out.println(a*b);
		System.out.println("Perimeterss of Cuboid is");
		System.out.println(12*a);
		System.out.println("Area of Rectangle");
		System.out.println(a*b);
		
		
	}
	

}

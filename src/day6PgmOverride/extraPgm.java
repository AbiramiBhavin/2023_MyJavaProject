package day6PgmOverride;

public class extraPgm extends childPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		extraPgm h=new extraPgm();
		h.cube(4, 4);
		
		

	}
	@Override
	public void cube(int a, int b) 
	{
		System.out.println("Grand Child Class Program");
		System.out.println(a*b);
		//here i have override but the object is created for prev class child class so child op is generated
		
	}
	public void display()
	{
		System.out.println("DISPLAY ANS");
	}
	
	
	

}

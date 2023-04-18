package day6PgmOverride;

public class newwayObjCrea extends extraPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
extraPgm p= new newwayObjCrea();
p.cube(2, 3);
p.display();
	}
	@Override
	public void cube(int a, int b) 
	{
		System.out.println("out Program");
		System.out.println(a*b);
		
		
	}
	
	

}

package day7Constructor;

public class Suprkw extends Thiskw 
{ 
//calling constructor and its objects Using super kw 
	
	//while extending class the child class must have same constructor skeleton as main class so asking for super kw
	
	protected Suprkw(int a,int b)
	{
		super(a,b); //super is going to call parent class constructor and load values since its a parametrized cons in parent class
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we comment this.action func in prev pgm all calc will not be exe only add will be exec
		
		Suprkw s=new Suprkw(20,30);//here by creating obj for this child class i can access parent class func bcoz i used superkw
		System.out.println("by using super funct and calling add function for prev pgm");
		s.add();
		System.out.println("assing new values to this pgm we created new func values we cannot directly give here as it is a static main");
		s.newvalues();
		s.add();// super csnnot be called in static main so we are creating obj and calling it
		}
	
	public void newvalues()
	{
		super.a=60;// by using super kw here we are reassing the values of parent class variables 
		super.b=30;
	}
			
}

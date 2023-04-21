package day7Constructor;

public class Thiskw {
	long a,b; // declaring global variable

	protected Thiskw(int a,int b)
	{
		
		this.a=a;
		this.b=b; //here This keyword is used inside constructor bcoz same varaiable is used
		// if a1 is used in cons then a=a1;
		this.action(); //to call method inside constructor we use this kw
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskw t=new Thiskw(1,4);// one of creating and passing values inside obj
		t.display();
		//instead of calling action func here we called in consrtuctor for easy exec and compilation
		
		//t.action();
		
		}
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public void mul()
	{
		System.out.println(a*b);
	}
	void div()
	{
		System.out.println(a/b);
	}
	
	public void action()
	{
		add();
		sub();
		mul();
		div();
		
		
		
		
		
	}
	void display()
	{
		System.out.println("thank you"); 
	}

}

package day3met;

public class Methodcre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(5.5f,2.5f);
		Methodcre g=new Methodcre(); //obj creation to call non static to static method
		g.divide(100, 20);
		long n=main(40,40);// calling main method which return the int values and storing in int/long and printing in main execution
		System.out.println(n*n);

	}
	public static void multiply(float a,float b)
	{
		System.out.println(a*b);
	}
	public void divide(int a,int b)
	{
		System.out.println(a/b);
	}
	public static int main(int c, int d)
	{
		return c+d;
	}

}

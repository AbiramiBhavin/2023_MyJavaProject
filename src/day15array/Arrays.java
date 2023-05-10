package day15array;

public class Arrays {

	public static void main(String[] args) {
		// This program is used to explain the arrays
		// Array is storing multiple values, 
		int x[]=new int[5]; // Array declaration definning array size // 0 to 4
		x[0]=10;x[1]=20;x[2]=30;x[3]=40;x[4]=50;// Assigning values in array
		System.out.println("For loop");
		for(int i=0;i<5;i++)
		{
			System.out.println(x[i]); // printing array values in for loop
		}
		System.out.println("While loop");
		int a=0;
		while(a<5)
		{
			System.out.println(x[a]);// printing array values in while loop
			a=a+1;
		}
		System.out.println("For each");
		for(int y:x)// for each loop each value of x is assigned to y
		{
			System.out.println(y);
		}
		
	}

}

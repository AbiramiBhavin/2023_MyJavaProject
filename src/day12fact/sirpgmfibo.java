package day12fact;

public class sirpgmfibo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		int i=1;
		while(i<=10)
		{
			System.out.println(a);
			c=a+b;// new value
			a=b;
			b=c;
			i=i+1;
		}
	}

}

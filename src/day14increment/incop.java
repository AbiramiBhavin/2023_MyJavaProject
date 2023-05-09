package day14increment;

public class incop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In this program we deal with post and pre increment
		int a=0;
		System.out.println(a);
		int b=++a;// a gets incremented by one and assigned to b
		System.out.println("-------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("+++++++++");
		int c=a++;// current a value is assigned to c
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}

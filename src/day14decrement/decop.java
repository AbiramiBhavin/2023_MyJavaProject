package day14decrement;

public class decop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In this program we deal with post and pre decrement
				int a=12;
				System.out.println(a);
				int b=--a;// a gets decremented by one and assigned to b
				System.out.println("-------------");
				System.out.println(a);
				System.out.println(b);
				System.out.println("+++++++++");
				int c=a--;// current a value is assigned to c => Post decrement
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
	}

}

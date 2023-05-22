package Day18HashMap;
import java.util.*;

public class GettingipfromuserInmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
HashMap<Integer,String> ab=new HashMap<>();
System.out.println("Enter the size");
int size=sc.nextInt();

for(int i=0;i<size;i++)
{
	System.out.println("Enter the key");
	int k=sc.nextInt();
	System.out.println("Enter the value");
	String v=sc.next();
	ab.put(k,v);
}
System.out.println(ab);
	}

}

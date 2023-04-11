package day4inh;

public class Pgmchild extends PgmInheri {

	public static void main(String[] args) {
		
		square(10);
		PgmInheri p=new PgmInheri();
		p.circle(5);// created object for parent class PgmInheri as circle is a non static method but i cannot use that object for this method for child class
//p.rectangle(20,10); error for this as method rectangle does not belong to inheri class so creating new obj
		Pgmchild c=new Pgmchild();
		c.rectangle(10,20);
	}
public void rectangle(int l, int b)
{
	System.out.println("area of rectangle");
	System.out.println(l*b);
}

}

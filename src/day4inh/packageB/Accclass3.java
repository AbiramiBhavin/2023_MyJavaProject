package day4inh.packageB;
import day4inh.packageA.accclass;
public class Accclass3 extends accclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(50,50);
		mul(10,90);
		//div(100,50); this default access specifier is not accessible from one package to other package only public and protected used.

	}

}

package day4inh.packageB;
import day4inh.packageA.accclass;
public class proteg  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accclass u= new accclass();// here we are creating object for parent class since we dont use extends and access the public methd
u.add(10,10);
//mul(30,20); protected specifier in parent class so coudnt access here bcoz we dont use the kerword extends
	}

}

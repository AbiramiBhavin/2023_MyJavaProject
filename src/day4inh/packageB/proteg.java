package day4inh.packageB;
import day4inh.packageA.accclass; //importing package
public class proteg    {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accclass u= new accclass();// here we are creating object for parent class since we dont use extends and access the public methd
u.add(10,10); //since itis a static methosd ccesing in static way
		//i tried with extend paret class from prev package in line 3,9
		//add(10,10); //since itis a static methosd ccesing in static way
//mul(30,20); protected specifier in parent class so coudnt access here bcoz we dont use the kerword extends
	}

}

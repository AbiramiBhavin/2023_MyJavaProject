package day13dowhile;

public class Dowhileeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DO WHILE IS A EXIT controlled loop
		// executes the loop atleat once even though the condition is false, but not execute inside content
		int a=1;
	do
	{
		System.out.println("Execution of do while loop");
		a=a+1;
	}while(a<=5);
	// when u give the increment outside the loop  since it s ado while loop it excuted once eventhough the condition is false
	//it becomes infinite loop if declared outise the loop
	int c=0;
	while(c<=5)
		//0<=5,1<=5,2<=5,3<=5,4<=5,5<=5
	{
		System.out.println("while loop exe");
		c=c+1;
	}
	}

}




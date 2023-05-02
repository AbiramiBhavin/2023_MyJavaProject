package day12Ams;

import java.util.Scanner;

public class Amstro {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the number to check for Amstrong or not");
		int ip=st.nextInt();
		st.close();
		String ips=String.valueOf(ip);
		int len= ips.length();
		int i=0;
		int value;
		double result=0;
		while(i<len)
		{
			value=Integer.parseInt(ips.charAt(i)+"");
			result=Math.pow(value,len)+result;
			i=i+1;
		}
		System.out.println("The sum is " +result);
		if(ip==result)
		{
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}
		

	}

}

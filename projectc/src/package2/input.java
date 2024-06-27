package package2;

import java.util.Scanner;

public class input 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		System.out.println("The value of a is"+a);
		System.out.println("Enter the value of f");
		float f=ob.nextFloat();
		System.out.println("The value of f is"+f);
		
	}
}

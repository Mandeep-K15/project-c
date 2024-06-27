package package1;

public class Arithmetic                         //class creation
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is"+c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction result is"+z);
		return z;
	}
	
	public void multi(int a1, int a2)
	{
		int result;
		result=a1*a2;
		System.out.println("Result is"+result);		
	}
	                   /////////////////////////////
	
	public static void main(String[] args)        //main methos creation 
	{
		Arithmetic ob=new Arithmetic();           //object creation
		int sumresult=ob.sum(10,2);              //calling method & variable
		int subresult=ob.sub(10,2);               //calling method & variable
		ob.multi(sumresult,subresult);            //calling method & variable
		
	}
}

package package1;

public class Arithmetic2                       //class creation
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is"+c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction is "+z);
		return z;
	}
	
	public int multi(int m, int n)
	{
		int o;
		o=m*n;
		System.out.println("Multiplication is "+o);
		return o;
	}
	
	public void div(int a1, int a2)
	{
		int result;
		result=a1/a2;
		System.out.println("Result is "+result);
	}
			///////////////////////////////
	
	public static void main(String[] args)       //main method creation
	{
		Arithmetic2 ob=new Arithmetic2();		//object creation
		
		int sumresult=ob.sum(10,2);					//calling + Declaration
		int sumresult2=ob.sum(sumresult,2);			//calling + Declaration
		int subresult=ob.sub(sumresult2,2);			//calling + Declaration
		int multiresult=ob.multi(subresult,2);		//calling + Declaration
		ob.div(multiresult,2);						//calling
	}
	
}

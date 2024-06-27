package package1;

public class deepak   // class creation
{
	int deepak1;
	public void display()
	{
		System.out.println("Welcome to all");
	}
	
	public static void main(String[] args)   //main method creation
	{
		deepak ob=new deepak();              //object creation
		ob.display();                        //calling the method
		ob.display();
		ob.deepak1=334;                      
		
		System.out.println(ob.deepak1);       // calling the variable
		System.out.println("Value of deepak1 is"+ob.deepak1);
	}
}

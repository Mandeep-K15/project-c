package package1;

public class student                  //class creation
{
	int age, rollnum ;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)      //main method creation
	{
		student ob=new student();               //object creation
		ob.display1();                          //method calling
		ob.display2();                          //method calling
		
		ob.age=15;                             //initialization
		ob.rollnum=101;
		
		System.out.println("Age of the student is" +ob.age);      //variable calling
		System.out.println("Roll Number of student is"+ob.rollnum);
	}
}

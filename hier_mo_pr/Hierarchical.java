class Teacher 
{
	int a=10;
	int b=20;
}
class Student1 extends Teacher
{
	int c=30;
	void printa()
	{
		System.out.println("From teacher "+a+" & "+b+" From Studnet1="+c);
	}
}
class Student2 extends Teacher
{
	int d=40;
	void printb()
	{
		System.out.println("From Studnet2= "+d+" & from teacher= "+a+" & "+b);
	}
}
class Hierarchical
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1();
		s1.printa();
		Student2 s2=new Student2();
		s2.printb();
		System.out.println("***************************");
	}
}

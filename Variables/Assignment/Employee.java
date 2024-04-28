class Emp 
{
	static int id;
	int sal;
	String grade;
}
class Employee
{

	public static void main(String[] args) 
	{
		Emp.id=101;
		Emp e=new Emp();
		e.sal=75000;
		e.grade="Test Engineer";
		System.out.println(Emp.id+" "+e.sal+" "+e.grade);
	}
}

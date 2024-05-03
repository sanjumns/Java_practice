class Teacher 
{
	void givenotes()
	{
		System.out.println("Take notes");
	}
}
class Passby_ref
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher();
		Student.neednotes(t);
	}
}
class Student
{
	static void neednotes(Teacher t)
	{
		t.givenotes();
	}
}
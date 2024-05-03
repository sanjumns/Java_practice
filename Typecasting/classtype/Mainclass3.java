class Tester 
{
	void fo()
	{
		System.out.println("I'm super");
	}
}
class Dev extends Tester
{
	void done()
	{
		System.out.println("I'm sub");
	}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		//upcast
		Tester t=new Dev();
		t.fo();
		//downcast
		Dev d=(Dev) t;
		d.done();
		d.fo();
		t.fo();
		System.out.println("Main ends here");
	}
}

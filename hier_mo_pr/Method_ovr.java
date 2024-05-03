class Android_11 
{
	void security()
	{
		System.out.println("It is secured");
	}
}
class Android_12 extends Android_11
{
	void security()
	{
		System.out.println("It is more secured");
	}
}
class Method_ovr
{
	public static void main(String[] args) 
	{
		Android_12 a=new Android_12();
		a.security();
		System.out.println("***********************");
	}
}

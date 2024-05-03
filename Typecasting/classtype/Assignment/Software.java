class Sql 
{
	void learn()
	{
		System.out.println("I'm learning SQL");
	}
}
class Java extends Sql
{
	void practice()
	{
		System.out.println("I'm using SQL in java");
	}
}
class Software
{
	public static void main(String[] args) 
	{
		Sql s=new Java(); //upcasting
		s.learn();
		Java j=(Java) s; //downcasting
		j.learn();
		j.practice();

		System.out.println("***************************");
	}
}

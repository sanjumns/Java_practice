class Kannada 
{
	String a="kannada";
}
class Hindi extends Kannada
{
	String b="Hindi";
}
class Movies
{
	public static void main(String[] args) 
	{
		Hindi h=new Hindi();

		System.out.println("Movies you can watch are "+h.a+" "+h.b);
	}
}

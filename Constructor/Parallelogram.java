class Parallelogram 
{
	int result;
	int b;
	int h;

	Parallelogram(int c, int i)
	{
		b=c;
		h=i;
		result=b*h;
	}
	public static void main(String[] args) 
	{
		Parallelogram p= new Parallelogram(5,6);
		System.out.println(p.result);
	}
}

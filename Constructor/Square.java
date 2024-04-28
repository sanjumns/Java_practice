class Square 
{
	int a;
	Square(int b)
	{
		a=b;
		int res=a*a;
		System.out.println(res);
	}	
	public static void main(String[] args) 
	{
		Square s=new Square(55);
		
	}
}

class Rectangle
{
	int area(int b,int w )
	{
		int res=b*w;
		return res;
	}

	public static void main(String[] args) 
	{
		System.out.println(new Rectangle().area(7,10));
	}
}

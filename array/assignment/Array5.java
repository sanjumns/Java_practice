class Array5 
{
	public static void main(String[] args) 
	{
		int f[]={1,2,3,4,5,6,7};
		System.out.println("Array length is "+f.length);
		for (int i=0;i<f.length ;i++ )
		{
			if (f[i]%2==1)
			{
				System.out.println("Odd number "+f[i]);
			}
			if (f[i]%2==0)
			{
				System.out.println("Even number "+f[i]);
			}
		}
		System.out.println("***************");
	}
}

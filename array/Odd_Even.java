class Odd_Even 
{
	public static void main(String[] args) 
	{
		int[] a={11,23,30,40,50,60,70,85,90,100};
		System.out.println("*************************");
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]%2==1)
			{
				System.out.println("Odd number ----> "+a[i]+" |");
			}
		}
		System.out.println("*************************");
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number ---> "+a[i])+" |");
			}
		}
		System.out.println("*************************");
	}
}

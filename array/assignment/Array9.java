class Array9 
{
	String[] a;
	double[] b;
	Array9()
	{
		String m[]={"Pradeep","Arjun","Vijay","Preetham"};
		double n[]={59.35,81.23,78.35,92.55};
		a=m;
		b=n;
	}
	public static void main(String[] args) 
	{
	/*	String a[]={"Pradeep","Arjun","Vijay","Preetham"};
		double b[]={59.35,81.23,78.35,92.55}; */

		Array9 x=new Array9(); //Object and initializing constructor

		//printing array using global variables
		System.out.println("Array length is "+x.a.length+" and "+x.b.length);
		for (int i=0;i<x.a.length ;i++ )
		{
			System.out.println(x.a[i]+" scored "+x.b[i]);
		}
		System.out.println("********************");
	}
}

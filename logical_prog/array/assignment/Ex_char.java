import java.util.Arrays;
class Ex_char
{
	public static void main(String[] args) 
	{
		char[] a={'H','Y','T','S','V'};
		Arrays.sort(a);
		print_a_f(a);
		print_a_b(a);
		System.out.println("***********************");
	}
	static void print_a_f(char[] x)
	{
		System.out.println("***********************");
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
	}
	static void print_a_b(char[] x)
	{
		System.out.println("***********************");
		for (int i=x.length-1;i>=0 ;i-- )
		{
			System.out.println(x[i]);
		}
	}
}

class Sample7 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,5,4,6,7,8,12};
		int count=0;

		for (int i=0;i<arr.length ;i++ )
			if (arr[i]%2==0)
		{
			count++;
		}
		System.out.println(count);
	}
}

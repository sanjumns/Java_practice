class Novel 
{
	String author;
	int cost;
	String name;
	Novel(String author, int cost, String name)
	{
		this.author=author;
		this.cost=cost;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Novel t=new Novel("Kudiyar koosu",330,"Shivaram Karanth");
		System.out.println(t.author);
		System.out.println(t.cost);
		System.out.println(t.name);
	}
}

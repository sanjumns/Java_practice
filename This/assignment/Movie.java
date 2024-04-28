class Movie 
{
	String name;
	int year;
	String genre;
	Movie(String name, int year, String genre)
	{
		this.name=name;
		this.year=year;
		this.genre=genre;
	}
	public static void main(String[] args) 
	{
		Movie m=new Movie("Terminator",1987,"Sci-fi");
		System.out.println(m.name);
		System.out.println(m.year);
		System.out.println(m.genre);
	}
}
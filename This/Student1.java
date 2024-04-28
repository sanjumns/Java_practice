class Student1 
{
	String name;
	String univ;
	double excost;
	Student1(String name, String univ, double excost)
	{
		this.name=name;
		this.univ=univ;
		this.excost=excost;
	}
		

	public static void main(String[] args) 
	{
		Student1 s1=new Student1("Sanjay","VTU",2500);

		System.out.println(s1.name);
		System.out.println(s1.univ);
		System.out.println(s1.excost);



	}
}

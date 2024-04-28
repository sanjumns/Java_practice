class School 
{
	static String name;
	char grade;
	int strength;

	public static void main(String[] args) 
	{
		name="SVS";
		School s=new School();
		s.grade='A';
		s.strength=453;
		System.out.println(name+" "+s.grade+" "+s.strength);
	}
}

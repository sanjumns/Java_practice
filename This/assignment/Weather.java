class Weather 
{
	String place;
	int precipitation;
	String unit;

	Weather(String place, int precipitation, String unit)
	{
		this.place=place;
		this.precipitation=precipitation;
		this.unit=unit;
	}
	public static void main(String[] args) 
	{
		Weather w=new Weather("Davanagere",110,"mm");
		System.out.println(w.place);
		System.out.println(w.precipitation);
		System.out.println(w.unit);
	}
}

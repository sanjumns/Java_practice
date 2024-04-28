class Multichar
{
	public static void main(String[] args)
	{
		switch("Hello")
		{
			case "Hi" : System.out.println("Hi");
					break;
			case "Hello" : System.out.println("Hello");
					break;
			case "Hey" : System.out.println("Hey");
					break;
			case "You" : System.out.println("You");
					break;
			default : System.out.println("Invalid");
		}
	}
}
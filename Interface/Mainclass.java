interface Animal 
{
	void noise();
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("Meow Meow");
	}
}
class Snake implements Animal
{
	public void noise()
	{
		System.out.println("Busssss busssss");
	}
}

class Stimulator
{
	static void ansim(Animal a)
	{
		a.noise();
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		Cat c=new Cat();
		Snake s=new Snake();
		Stimulator.ansim(d);
		Stimulator.ansim(c);
		Stimulator.ansim(s);

		System.out.println("*************************");
	}
}

class Animal 
{
	void noise()
	{
		System.out.println("Some noise");
	}
}
class Dog extends Animal 
{
	void noise()
	{
		System.out.println("Bow bow");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("Meow Meow");
	}
}
class Snake extends Animal 
{
	void noise()
	{
		System.out.println("Bussss Busssss");
	}
}
class Stimulator
{
	static void ansim(Animal s)
	{
		s.noise();
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
		System.out.println("******************************");
	}
}

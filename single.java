
class Base
{
	public int A,B;
	public Base()
	{
		System.out.println("Base constructor");;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
	public void gun()
	{
		System.out.println("Inside Base gun");
	}
	public void fun(int No)
	{
		System.out.println("Inside Base fun with one integer");
	}
}


class Derived extends Base    // class Derived : public Base
{
   public int X,Y;	
}

class Single
{
	public static void main(String arg[])
	{
		
	}
}
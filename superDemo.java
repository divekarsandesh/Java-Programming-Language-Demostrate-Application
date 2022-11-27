
class Base
{
	public int A,B;
	public Base(int No1,int No2)
	{
		this.A = No1;
		this.B = No2;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
		System.out.println("value of A from fun method is :"+this.A);
	}
}

class Derived extends Base
{
	public int X,Y;
	public Derived(int i,int j, int k, int l)
	{
		super(k,l);    // 1 usecase
		this.X = i;
		this.Y = j;
	}
	public void gun()
	{
		System.out.println("Value of A from gun method is :"+super.A);
	    super.fun();   // 3 usecase 
	}
}

class superDemo
{
	public static void main(String a[])
	{
		Derived dobj = new Derived(11,21,51,101);
		dobj.gun();
	}
}
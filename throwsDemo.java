class Arithematic
{
	public int Division(int A, int B) throws ArithmeticException
	{
		int Ans = 0;
		Ans = A / B;
		return Ans;
	}
}
class throwsDemo
{
	public static void main(String a[])
	{
		Scanmer sobj = new Scanner(System.in);
		System.out.println("Enter first number");
		int iNo1 = sobj.nextInt();
		System.out.println("Enter second number");
		int iNo2 = sobj.nextInt();
		
		Arithematic aobj = new Arithematic();
		
		try
		{
			int Ret = aobj.Division(iNo1,iNo2);
			System.out.println("Division is:"+Ret);
		}
		catch(ArithematicException obj)
		{
			System.out.println("Exception occured");
			System.out.println(obj);
		}
	}
}
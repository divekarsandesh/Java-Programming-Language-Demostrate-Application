class Demo
{
    public int No1;
    public int No2;

    public Demo(int a, int b)
    {
        No1 = a;
        No2 = b;
    }
}

class equalDemo
{
    public static void main(String A[])
    {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println("HashCode of s1 :"+s1.hashCode());
		System.out.println("HashCode of s2 :"+s2.hashCode());
		
		/*
        Demo obj1 = new Demo(11,21);
         Demo obj2 = new Demo(11,21);

        if(obj1.equals(obj2))
		{
        System.out.println("Objects are same");
		}
		else
		{
		 System.out.println("Objects are different");	
		}
*/	
         if(s1.equals(s2))
		{
        System.out.println("Objects are same");
		}
		else
		{
		 System.out.println("Objects are different");	
		}
		
		 if(s1 == s2)
		{
        System.out.println("Objects are same");
		}
		else
		{
		 System.out.println("Objects are different");	
		}
    }
}
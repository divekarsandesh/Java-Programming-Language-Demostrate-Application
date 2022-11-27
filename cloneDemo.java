
class Employee implements Cloneable
{
	public int Eid;
	public String Name;
	public int Salary;
	
	public Employee(int No, String str, int value)
	{
		this.Eid = No;
		this.Name = str;
		this.Salary = value;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class cloneDemo
{
	public static void main(String A[])
	{
		try
		{
		Employee eobj1 = new Employee(101,"Sandesh",21000);
	    
		
	    System.out.println("Name of first employee : "+eobj1.Name);
		System.out.println("Name of Second employee : "+eobj1.Salary);
		
		System.out.println("Salary of first employee : "+eobj1.Name);
		System.out.println("Salary of first employee : "+eobj1.Salary);
		
		
         eobj1.Name="sagar";
		 System.out.println("Name of first employee : "+eobj1.Name);
		System.out.println("Name of Second employee : "+eobj1.Salary);
		
		 }
	
	    catch(CloneNotSupportedException obj)
	    {}
	}	
}
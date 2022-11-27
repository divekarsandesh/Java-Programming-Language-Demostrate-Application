
interface Circle
{
	float PI = 3.14;
	
	float Area(float Radius);
	float Circumfarence(float Radius);
}

class Marvellous implements Circle
{
	public float Area(float Radius)
	{
		return PI * Radius * Radius;
	}
	public float Circumfarance(float Radius)
	{
		return 2 * PI * Radius;
	}
}
class interfaceDemo
{
	public static void main(String Arr[])
	{
		System.out.println("Value of PI is :"+Circle.PI);
		// Circle.PI = 7.12F;
		Circle cobj = new Marvellous();
		float Ret = 0.0f;
		Ret = cobj.Area(10.5f);
		System.out.println("Area is :"+ Ret);
		Ret = cobj = new
		
	}
}
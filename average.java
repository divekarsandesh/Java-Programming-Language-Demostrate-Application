import java.util.Scanner;

class average
{
	public static void main(String arg[])
	{
	  System.out.println("How many number you want to enter?");
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  
	  double[] arr = new double[n];
	  double total = 0;
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  System.out.println("Enter Element No."+(i+1)+": ");
		  arr[i] = scanner.nextDouble();
	  }
	  scanner.close();
	  for(int i=0; i<arr.length; i++)
      {
		  total = total +arr[i];
	  }
	  
	  double average = total / arr.length;
	  System.out.format("The average is: %.3f", average);
	}
}
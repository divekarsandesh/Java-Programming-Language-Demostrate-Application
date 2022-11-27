import java.util.Arrays;
class largest
{
  public static void main(String arg[])
  {
	  int array[] = {20,89,65,74,96,57};
	  int size = array.length;
	  Arrays.sort(array);
	  System.out.println("sorted Array ::"+Arrays.toString(array));
	  int res = array[size-1];
	  System.out.println("largest element is ::"+res);
  }  
}

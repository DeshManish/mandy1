package logicalSDETpawan;

public class MaxAndMinInArray
{
  public static void main(String[] args)
  {
	int a[]= {50,30,40,20,60};
	
	/*int max=a[0];
	
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	
	System.out.println("Max Element in array is: " + max); */
	
    int min=a[0];
	
	for(int i=0; i<a.length; i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	
	System.out.println("Min Element in array is: " + min);
	
}
}

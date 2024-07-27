package logicalSDETpawan;

public class EvenOddFromArray
{
  public static void main(String[] args)
  {
	int a[]= {1,2,3,4,5,6};
	
	//Extracting even no
	
	System.out.println("Even no in array....");
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		System.out.println(a[i]);
	}
	
    System.out.println("Odd no in array....");
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		System.out.println(a[i]);
	}
	
	//Enhanced for loop
	
	System.out.println("Even no in array....");
	
	for(int value:a)
	{
		if(value%2==0)
			System.out.println(value);
	}
	
}
}

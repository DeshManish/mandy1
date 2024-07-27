package logicalSDETpawan;

public class countNoOfEvenAndOddDigitsInNumber
{
  public static void main(String[] args)
  {
	int num=1234;
	
	int even_count=0;
	
	int odd_count=0;
	
	while(num>0) //1234
	{
		int rem = num%10; //4
		
		if(rem%2==0)
		{
			even_count++; //1
		}
		else
		{
			odd_count++;
		}
		
		num=num/10; //123
	}
	
	System.out.println("No of even no: " + even_count++);
	System.out.println("No of even no: " + odd_count++);
	
	
}
}

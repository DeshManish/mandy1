package logicalSDETpawan;

public class SwappingTwoNumbers
{
	public static void main(String[] args)
	{
		int a=10 , b=20;
		
		System.out.println("Before swapping values are..."+a+" "+b);
		
		//logic1: third varaible
		
	/*	int t=a;
		a=b;
		b=t;  */
		
		//logic 2 - use + and -   without using third variable
		
		/*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20 */
		
		//logic3 - use of * and /-  without using third variable
		
		/*a=a*b; //10*20=200
		b=a/b;  //200/20=10
		a=a/b;  //200/10=20 */
		
		//logic 4- use of bitwise xor(^)
		
		/*a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20 */
		
		//logic 5 -single statement
		
		b=a+b-(a=b);
		
		
		
		System.out.println("After swapping values are..."+a+" "+b);
	}

}

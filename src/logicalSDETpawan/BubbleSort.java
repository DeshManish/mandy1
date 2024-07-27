package logicalSDETpawan;

import java.util.Arrays;

public class BubbleSort
{
 public static void main(String[] args)
 {
	int a[]= {4,2,1,5,3};
	
	System.out.println("Arrays before sorting: " + Arrays.toString(a));
	
	Arrays.sort(a);
	
	
	//int n=a.length;
	
	/*for(int i=0; i<n-1; i++)   //number of passes
	{
		for(int j=0; j<n-1; j++) //Iteration in each pass
			                      //for 1 round of outer for loop 4 rounds of inner for loop will be executed
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}   */
	
   System.out.println("Arrays after sorting: " + Arrays.toString(a));
}
}

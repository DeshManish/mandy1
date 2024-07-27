package logicalSDETpawan;

import java.util.Arrays;

public class SortingElements
{
  // approach 1
	
  public static void main(String[] args)
  {
	  //Approach 1
		int a[]= {30,50,20,10,60};
		
		System.out.println("Array elements before sorting: " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		//Approach 2
		//Arrays.sort(a);
		
		//Approach 3
		//Integer a[]= {30,50,20,10,60};
		//Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Array elements after sorting: " + Arrays.toString(a));
		
		
		
		
}
	
	
}

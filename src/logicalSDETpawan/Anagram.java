package logicalSDETpawan;

import java.util.Arrays;

public class Anagram 
{
	public static void main (String []args)
	 {
	  String s1="care";
	  String s2="race";
	  
	  if (s1.length()==s2.length())
	  {
	   char[] so1 = s1.toCharArray();
	   char[] so2 = s2.toCharArray();
	   
	   Arrays.sort(so1);
	   Arrays.sort(so2);
	   
	   boolean sortresult = Arrays.equals(so1, so2);
	   
	   if(sortresult)
	   {
	    System.out.println("given string are anagram ");
	   }
	   
	   else
	   {
	    System.out.println("given string are not anagram");
	   }
	  }
	 }
	}

package logicalSDETpawan;

public class ReverseString
{
   public static void main(String[] args)
   {
	 //1. Using + (String concatenation operator)
	   
	   String str="abcd";
	   
	   String rev= "";
	   
	 /*  int len = str.length();
	   
	   for(int i=len-1;i>=0;i--)
	   {
		   rev=rev+str.charAt(i);
	   }
	   
	   System.out.println("Reversed String is:" + rev); */
	   
	   //2. Using character array
	   
	  char a[] =str.toCharArray();
	   
	  int len = a.length; //4
	  
	  for(int i=len-1; i>=0; i--) //3 2 1 0 -1
	  {
		  rev=rev+a[i];
	  }
	  
	  System.out.println("Reversed String is:" + rev);
	  
	  //3. Using StringBuffer
	  
	  StringBuffer sb=new StringBuffer(str);
	  
	  System.out.println(sb.reverse());
	  
	  
}
}

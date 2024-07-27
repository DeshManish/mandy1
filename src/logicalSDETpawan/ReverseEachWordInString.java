package logicalSDETpawan;

public class ReverseEachWordInString
{
   public static void main(String[] args)
   {
	String str="Welcome to java"; //original string
	
	String[] words = str.split(" "); //splitting string to words
	
	String reverseString="";
	
	for(String w:words)
	{
		String reversewords="";
		
		for(int i=w.length()-1; i>=0; i--)
		{
			reversewords=reversewords + w.charAt(i);
		}
		
		reverseString=reverseString+reversewords+" ";
	}
	
	System.out.println(reverseString);
}
}

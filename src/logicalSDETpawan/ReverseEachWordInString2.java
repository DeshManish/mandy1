package logicalSDETpawan;

public class ReverseEachWordInString2 
{
	public static void main(String[] args)
	{
		String str="Welcome to Java";
		
		String[] words = str.split("\\s");
		
		String reversewords="";
		
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reversewords=reversewords + sb.toString() + " ";
		}
		
		System.out.println(reversewords);
	}

}

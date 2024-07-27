package logicalSDETpawan;

public class CountCharacterOccuranceInString 
{
  public static void main(String[] args)
  {
	String s="Java programming java oops";
	
	int totalcount=s.length();
	
	int totalcount_afterremove = s.replace("a", "").length();
	
	int count=totalcount - totalcount_afterremove;
	
	System.out.println("Number of occurance of a is: " + count);
}
}

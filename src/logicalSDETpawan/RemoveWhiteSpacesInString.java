package logicalSDETpawan;

public class RemoveWhiteSpacesInString
{
  public static void main(String[] args)
  {
	String str="Java    Programming   selenium  automation";
	
	str=str.replaceAll("\\s", "");
	
	System.out.println("After removing white spaces: " + str);
}
}

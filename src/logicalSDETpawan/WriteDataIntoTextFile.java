package logicalSDETpawan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("E:\\Advance Testing Techniques\\test123.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with java");
		
		bw.write("Selenium with python");
		
		bw.write("Selenium with C#");
		
		System.out.println("Finished!!!");
		
		bw.close();
		
	}

}

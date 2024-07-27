package logicalSDETpawan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile
{
  public static void main(String[] args) throws IOException
  {
	  //Approach 1: using filereader and bufferreader
	  
/*	  FileReader fr=new FileReader("E:\\Advance Testing Techniques\\test123.txt");
	
	  BufferedReader br= new BufferedReader(fr);
	  
	  String str;
	  
	  while((str=br.readLine())!=null)
	  {
		  System.out.println(str);
	  }
	  
	  br.close();    */
	  
	  //Approach 2: using scanner and file
	  
	  FileReader fr=new FileReader("E:\\Advance Testing Techniques\\test123.txt");
	  
	  Scanner sc=new Scanner(fr);
	  
	/*  while(sc.hasNextLine())
	  {
		  System.out.println(sc.nextLine());
	  }
	  */
	  
	  //Approach 3
	  
	  sc.useDelimiter("\\Z");
	  System.out.println(sc.next());
	  
	  
	  
}
}

package logicalSDETpawan;

import java.util.Random;

public class GenerateRandomNumberAndStrings
{
 public static void main(String[] args)
 {
	//Approach 1: Random
	 
	 Random rand = new Random();
	 
	 /*int rand_int = rand.nextInt(10);
	 
	 System.out.println(rand_int); */
	 
	// double rand_dbl = rand.nextDouble();
	 
	// System.out.println(rand_dbl);
	 
	 //Approach 2: Math class
	 
	 System.out.println(Math.random());
	 
	 //approach 3: apache common lang api
	 //http.commons.apache.org
	 
	//String randNum= RandomStringUtils.randomNumeric(5);
	//System.out.println(randNum);
	 
	//String randStr= RandomStringUtils.randomAlphabetic(10);
		//System.out.println(randNum);
	 
	 
}
}

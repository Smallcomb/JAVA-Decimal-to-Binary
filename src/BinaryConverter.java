// Binary Converter - Develop a converter to convert a decimal 
// number to binary or a binary number to its decimal equivalent.

import java.util.Scanner;

public class BinaryConverter {
	
	static String decToBinary (double userDec)
	{	
		String bin = "";
		
		// find greatest 2^i value thats <= input (leftmost binary)
		double topDigit = 0;
		for(int i=1;Math.pow(2,i)<=userDec;i++)
		{
			topDigit++;
		}
		
		// loop through binary digit spaces, starting with greatest/leftmost
		for(double j = topDigit; j>=0; j--)
		{

			// if userDec >= 2^digit, subtract top digit from x, append 1 to string
			if(userDec >= Math.pow(2,j))
			{
				double square = Math.pow(2,j);
				userDec = (userDec - square);
				bin = bin.concat("1");
			}
			
			// if userDec < 2^digit, append 0 to string
			else
			{
				bin = bin.concat("0");
			}
		}		
		return bin;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Integer");
		
		Scanner scanner = new Scanner(System.in);
		double userDec = Integer.parseInt(scanner.nextLine());
		
		System.out.println(decToBinary(userDec));
	}
}

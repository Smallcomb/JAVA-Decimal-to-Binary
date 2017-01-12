// Binary Converter - Develop a converter to convert a decimal 
// number to binary or a binary number to its decimal equivalent.

import java.lang.Math.*;

public class BinaryConverter {
	
	// find greatest 2^n value thats < given userDec
	double findTopDigit (double userDec)
	{
		
		for(int i=1;Math.pow(2,i)<=userDec;i++)
		{
			double topDigit = i;		
		}
		return topDigit;
	}
	
	String decToBinary (int topDigit, double userDec)
	{	
		for(int j = topDigit; j>=1; j--)
		{
			// if userDec >= 2^digit, subtract top digit from x, append 1 to string
			if(userDec >= Math.pow(2,j))
			{
				userDec = userDec - Math.pow(2,j);
			}
			// if userDec < 2^digit, append 0 to string
		}
		
		String y;
		return y;
	}
	
	public static void main(String[] args) 
	{

	}

}

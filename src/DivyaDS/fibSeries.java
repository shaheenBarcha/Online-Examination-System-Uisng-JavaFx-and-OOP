package DivyaDS;

import java.util.Scanner;

public class fibSeries 
{ 
	static int fib(int range) 
	{ 
	if (range <= 1) 
	{
	return range; 
	}
	return fib(range-1) + fib(range-2); 
	} 
	
public static void main (String args[]) 
	{ 
	int range;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Your Enter range :");
	range = input.nextInt();
	
	System.out.println(fib(range)); 
	} 
} 

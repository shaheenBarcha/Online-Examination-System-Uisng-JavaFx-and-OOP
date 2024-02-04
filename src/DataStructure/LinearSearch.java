package DataStructure;

import java.util.Scanner;

public class LinearSearch {
	
	int check = 0;
	int count = 0;
	int linearSearch(int[] arr, int target)
	{
		for(int i = 1;i<=arr.length-1;i++)
		{
			if(arr[i] == target)
			{
				check = 1;
				break;
			}
			else
			{
				check = 0;
				count ++;
			}
		}
		return check;

	}
	int iteration()
	{
		return count;
	}

	public static void main(String[] args) {
		int [] arr = {4,77,88,1,2,5};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Your Target : ");
		int target = input.nextInt();
		
		LinearSearch ls = new LinearSearch();
		
		int result = ls.linearSearch(arr, target);
		
		if(result == 1)
		{
			System.out.println("Target Found : ");
		}
		else
		{
			System.out.println("Not Found :");
		}
		System.out.println("Iteration : "+ls.iteration());
	}
	
}

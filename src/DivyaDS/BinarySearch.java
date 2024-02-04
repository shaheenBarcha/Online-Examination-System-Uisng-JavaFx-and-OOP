package DivyaDS;

import java.util.Scanner;

class BinarySearch { 
	
	int binarySearch(int arr[], int start, int end, int target) 
	{ 
		if (start >= start) { 
			int mid = start + (end - start) / 2; 

			if (arr[mid] == target) 
				return mid; 

			if (arr[mid] > target) 
				return binarySearch(arr, start, mid - 1, target); 

			return binarySearch(arr, mid + 1, end, target); 
		} 

	
		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 1, 16, 99, 111, 340}; 
		int end = arr.length; 
		int target;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your target : ");
		target = input.nextInt();
		
		int result = ob.binarySearch(arr, 0, end - 1, target); 
		if (result == -1) 
			System.out.println("Target Not found :"); 
		else
			System.out.println("Target is at position : "+ result); 
	} 
} 


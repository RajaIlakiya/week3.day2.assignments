package week3.day2.assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 ArrayList<Integer> arrSet = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
	      HashSet<Integer> checkArrSet = new HashSet<Integer>();
	      HashSet<Integer> dupArrSet = new HashSet<Integer>();
	      for (Integer integer : arr) {
	         if(!checkArrSet.add(integer)) {
	        	 dupArrSet.add(integer);
	         }
	      }
	      System.out.println("Duplicate integers in given list is/are " + dupArrSet);
	   }	
	}



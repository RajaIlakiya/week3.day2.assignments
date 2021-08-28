package week3.day2.assignment6;
import java.util.*;



public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] arr1={3,2,11,4,6,7};	
		int[] arr2={1,2,8,4,9,7};
	      System.out.println("Intersection of the two arrays ::");
	      List<Integer> arr1list = new ArrayList<Integer>();   
			List<Integer> arr2list= new ArrayList<Integer>(); 
		for(int i=0;i<arr1.length;i++) {
			arr1list.add(arr1[i]);
		}
			for(int j=0;j<arr2.length;j++) 
				{
					arr2list.add(arr2[j]);
				}
					
					if(arr1list.retainAll(arr2list))
					{
					System.out.println(arr1list);
					}
	}
				}
			

		

	

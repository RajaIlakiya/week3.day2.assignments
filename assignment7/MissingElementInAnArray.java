package week3.day2.assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
//				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
		
		int[] arr = {0,1,2,3,4,7,6,8};
		List<Integer> arrSet=new ArrayList<Integer>();
	
for(int i=0;i<arr.length;i++)
{
	arrSet.add(arr[i]);
}
	Collections.sort(arrSet);	

		System.out.println(arrSet);
		int length=arrSet.size();
		for(int j=0;j<length;j++)
		{
			if(j!=arrSet.get(j))
			{
				System.out.println("Missing element in an array: " + j);
			break;
			}
		}

	}
}

package week3.day2.assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
	
		 */
				int[] data = {3,2,11,4,6,7};
				List<Integer> dataList= new ArrayList<Integer>(); 

for(int i=0;i<data.length;i++)
		{
	dataList.add(data[i]);
	}
Collections.sort(dataList);
int length=dataList.size();
				System.out.println("Find second largest element in array: " + dataList.get(length-2));
				
	}

}

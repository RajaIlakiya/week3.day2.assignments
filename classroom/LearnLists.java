package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
	static int arr[]= {3,4,5,2,2,1};
	static int arr1[]= {6,2,1,8};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int j=0;j<arr1.length;j++) {
			list1.add(arr1[j]);
		}
		
	System.out.println(list);
	
	System.out.println(list1);
	//print unique values
	list.retainAll(list1);
	System.out.println(list);
	//remove duplicates
	list1.removeAll(list1);
	System.out.println(list);


	}

}

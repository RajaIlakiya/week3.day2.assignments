package week3.day2.assignment5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates1 {

	 static void removeDuplicates(String str)   

	    {
		int count=0;
		String text = "We learn java basics as part of java sessions in java week1";
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<text.length();i++)   
	            set.add(text.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";

	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(text);   
}
}

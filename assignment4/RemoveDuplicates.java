package week3.day2.assignment4;

import java.util.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Declare a String as PayPal India
		String str = "PayPal India";
		
		str = str.toLowerCase();
		str = str.replace(" ", "");
		System.out.println(str);

//		Length of character
		int charLength = str.length();
		System.out.println("Length of character: " + charLength);

//		1.Convert it into a character array
		char[] charArray = str.toCharArray();
		System.out.println("Convert String into character array: ");
		

//		2.Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();

//		3.Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();

//		4.Iterate character array and add it into charSet		

//		5.If the character is already in the charSet then, add it to the dupCharSet

//		6.Check the dupCharSet elements and remove those in the charSet

//      7.Iterate using charSet

//   	8.Check the iterator variable isn't equals to an empty space

//		9.print it


		for (Character char1 : charArray) {
			boolean unique = charSet.add(char1);
			if (unique == false)
				dupCharSet.add(char1);

		}
		System.out.println("Duplicates are : " + dupCharSet);
		charSet.removeAll(dupCharSet);
       System.out.println("The character arrays are add it into charSet  : " + charSet);

	}

	}



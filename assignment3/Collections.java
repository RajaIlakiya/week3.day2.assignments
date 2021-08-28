package week3.day2.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		// 1.Declare a String array and use input String as Aspire systems, cts, Wipro, Hcl
		String[] strArray = { "HCL", "Aspire systems", "Wipro" , "CTS"};
		
	   // 2.Get the length of the array
		int length = strArray.length;
		System.out.println("Length of String array is: " + length);

		// 3. sort the arra
		Arrays.sort(strArray);
	
		System.out.println("Reverse sorting the given array is: ");

		// 4. Iterate it in the reverse order
             for (int i = (strArray.length - 1); i >= 0; i--) {

			// 5. print the array
			System.out.println(strArray[i]);
		}


		// 6. Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}

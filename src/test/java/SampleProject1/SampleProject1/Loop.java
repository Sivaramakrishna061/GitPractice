package SampleProject1.SampleProject1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Loop {

	public static void main(String[] args) {
		
		
		/*
		 * String str = "hello world";
		 * 
		 * String reverseString=""; String[] strArrays = str.split("\\s+"); for (String
		 * strArray:strArrays) { StringBuilder sb = new StringBuilder(strArray);
		 * reverseString += sb.reverse() + " "; }
		 * 
		 * System.out.println(reverseString);
		 */
		
		
		String str= "hello world";
		String[] array = str.split(" ");
		
		Set<String> set = new HashSet<>();
		
		
		for(int i=0; i<array.length;i++) {
			set.add(array[i]);
			
		}
		System.out.println(set);
	
	}
}
	
	
	
	


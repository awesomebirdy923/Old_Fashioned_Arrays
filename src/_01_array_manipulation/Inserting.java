package _01_array_manipulation;

import java.util.Arrays;

public class Inserting {
	
	public static int[] insertAt(int[] list, int num1, int num2) {
		list[num1] = num2;
		return list;
	}
	
	public static String[] insertAlphabetically(String list[], String s) {
		String[] newList = new String[list.length+1];
		
		for (int i = 0; i < list.length; i++) {
//			System.out.println(i);
			newList[i] = list[i];
		}
		
		newList[newList.length-1] = s;
		
		Sorting.sort(newList);
		
		return newList;
	}
	
}

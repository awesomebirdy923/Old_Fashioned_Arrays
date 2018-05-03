package _01_array_manipulation;

import java.util.Arrays;

public class Inserting {
	
	public static int[] insertAt(int[] list, int num1, int num2) {
		int[] newList = new int[list.length+1];
		for (int i = 0; i < newList.length; i++) {
			if(i == num1) {
				newList[num1] = num2;
			}else if(i < num1){
				newList[i] = list[i];
			}else if(i > num1) {
				newList[i] = list[i-1];
			}
		}
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		return newList;
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

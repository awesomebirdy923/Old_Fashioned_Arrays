package _01_array_manipulation;

import java.util.ArrayList;

public class Sorting {

	
	public static void sort(String list[]) {
		
		int length = list.length;
		String temp = "";
		
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if(list[i].compareTo(list[j]) > 0) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	
}

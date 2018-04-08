package _01_array_manipulation;



public class Inserting {
	
	public static int[] insertAt(int[] list, int num1, int num2) {
		list[num1] = num2;
		return list;
	}
	
	public static String[] insertAlphabetically(String list[], String s) {
		String[] newList = new String[list.length+1];
		
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		
		newList[list.length] = s;
		
		Sorting.sort(newList);
		
		return newList;
	}
	
}

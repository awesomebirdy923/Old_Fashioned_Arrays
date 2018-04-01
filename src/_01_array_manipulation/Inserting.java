package _01_array_manipulation;



public class Inserting {
	
	public static int[] insertAt(int[] list, int num1, int num2) {
		list[num1] = num2;
		return list;
	}
	
	public static String[] insertAlphabetically(String list[], String s) {
		String[] newList = new String[list.length+1];
		newList[list.length+1] = s;
		
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
			System.out.println(newList[i]);
		}
		
		for (int i = 0; i < newList.length; i++) {
			for (int j = i+1; j < newList.length; j++) {
				if(newList[i].compareTo(newList[j]) > 0) {
					String temp = newList[i];
					newList[i] = newList[j];
					newList[j] = temp;
				}
			}
		}
		return newList;
	}
	
}

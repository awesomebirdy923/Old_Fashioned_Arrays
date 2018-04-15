package _02_diy_array_list;

public class ArrayList<T>{

	T var;
	
	T[] list = (T[]) new Object[0];
	
	public void add(T var) {
		T[] newList = (T[]) new Object[list.length+1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		newList[newList.length - 1] = var;
		list = newList;
	}
	
	public T get(int i) {
		return list[i];
	}
	
	public void addAt(int index, T var) {
		T[] newList = (T[]) new Object[list.length+1];
		boolean passed = false;
			for (int j = 0; j < newList.length; j++) {
				
				if(j != index && !passed) {
				newList[j] = list[j];
				}else {
					if(j == index) {
						newList[j] = var;
						passed = !passed;
					}else {
						newList[j] = list[j - 1];
					}
				}
			}
		list = newList;
		for (int i = 0; i < newList.length; i++) {
			System.out.println(newList[i]);
		}
	}
	
	public void set(int i, T var){
		list[i] = var;
	}
	
	public void remove(int index) {
		T[] newList = (T[]) new Object[list.length-1];
		boolean passed = false;
			for (int j = 0; j < list.length; j++) {
				if(j != index && !passed) {
				newList[j] = list[j];
				}else {
					if(j == index) {
						passed = !passed;
					}else {
						newList[j - 1] = list[j];
					}
				}
			}
		list = newList;
	}
	
	public boolean contains(T var) {
		for (int i = 0; i < list.length; i++) {
			if(list[i] == var) {
				return true;
			}
		}
		return false;
	} 
	
}

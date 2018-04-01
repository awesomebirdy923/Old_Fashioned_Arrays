package _02_diy_array_list;

public class ArrayList<T>{

	T var;
	
	T[] list = (T[]) new Object[255];
	
	public void add(T var) {
		list[list.length] = var;
	}
	
	public T get(int i) {
		return list[i];
	}
	
	public void addAt(int i, T var) {
		list[i] = var;
	}
	
}

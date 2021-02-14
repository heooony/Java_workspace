package ex0210;

import java.util.ArrayList;

class ArrayListExam extends ArrayList{

	Object obj;
	int i;

	public ArrayListExam(){
			super(5);
	}

	public void addInt(int i) {
		add(i);
	}
		
	public void addFloat(float f) {
		Float ft = Float.valueOf(f);
		add(ft);
	}
	
	public void addString(String s) {
		String st = new String(s);
		add(st);
	}
	
	public void printList() {
		i = size();
		System.out.println("list에 들어있는 객체의 총 개수는 = " + i);
		for(int count = 0; count < i; count++) {
			obj = get(count);
			System.out.println(obj);
		}
	}
		
	public static void main(String args[]){
		ArrayListExam list = new ArrayListExam();
		String s = new String("newString");		 
		list.addInt(5);
		list.addFloat(5.5F);
		list.addString(s);
		list.printList();
	}
}
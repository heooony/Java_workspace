package ex0210;

import java.util.ArrayList;
import java.util.List;

public class ListMethodExam {
	List<String> list = new ArrayList<String>(5);

	public ListMethodExam(String[] args) {
		for(String name : args) {
			list.add(name);
		}
	}
	
	public void printList() {
		System.out.println("ÃÑ °³¼ö : " + list.size());
		
		for(String name : list) {
			System.out.println(name);
		}
	}
	
	public void test() {
		list.remove("µ¿");
		this.printList();
		
		list.set(1, "aa");
		this.printList();
	}
	
	public static void main(String[] args) {
		new ListMethodExam(args).test();
	}
}

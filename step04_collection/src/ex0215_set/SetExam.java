package ex0215_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExam extends TreeSet<String> {
	public SetExam(String[] args) {
		//super(5);
		for(String s : args) {
			boolean re = super.add(s);
			System.out.println(s + "�߰� ��� : " + re);
		}
		
		System.out.println("--��ϰ��--");
		System.out.println(this);
		
		Iterator<String> it = this.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		new SetExam(args);
	}
}

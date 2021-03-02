package ex0215_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExam extends HashMap<Integer, String>{
	public MapExam() {
		put(10, "����");
		put(30, "����");
		put(20, "������");
		put(10, "����");
		put(40, "�����̺�");
		put(30, "���Ľ�");
		
		System.out.println("�߰� �� : " + this);
		String value = super.remove(30);
		System.out.println("���ŵ� ��ü : " + value);
		System.out.println("���� �� : " + this);
		
		Set<Integer> set = super.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int k = it.next();
			String v = super.get(k);
			System.out.println(k + " : " + v);
		}
		
		Set<Map.Entry<Integer, String>> entrySet = super.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Integer, String> entry = entryIt.next();
			int k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		
		for(Map.Entry<Integer, String> e : super.entrySet()) {
			Integer k = e.getKey();
			String v = e.getValue();
			System.out.println(k + " : " + v);
		}
	}
	
	public void searchByKey(int k) {
		if(super.containsKey(k)) {
			String v = super.get(k);
			System.out.println(k + "�� �ش��ϴ� ������ " + v);
		} else {
			System.out.println(k + "�� �ش��ϴ� ������ �����ϴ�.");
		}
		
		String v = super.get(k);
		if(v != null) {
			System.out.println(k + "�� �ش��ϴ� ������ " + v);
		} else {
			System.out.println(k + "�� �ش��ϴ� ������ �����ϴ�." );
		}
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.searchByKey(20);
		System.out.println("------------");
		me.searchByKey(80);
	}
}

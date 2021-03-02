package ex0215_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExam extends HashMap<Integer, String>{
	public MapExam() {
		put(10, "동원");
		put(30, "동투");
		put(20, "동쓰리");
		put(10, "동포");
		put(40, "동파이브");
		put(30, "동식스");
		
		System.out.println("추가 후 : " + this);
		String value = super.remove(30);
		System.out.println("제거된 객체 : " + value);
		System.out.println("제거 후 : " + this);
		
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
			System.out.println(k + "에 해당하는 정보는 " + v);
		} else {
			System.out.println(k + "에 해당하는 정보는 없습니다.");
		}
		
		String v = super.get(k);
		if(v != null) {
			System.out.println(k + "에 해당하는 정보는 " + v);
		} else {
			System.out.println(k + "에 해당하는 정보는 없습니다." );
		}
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.searchByKey(20);
		System.out.println("------------");
		me.searchByKey(80);
	}
}

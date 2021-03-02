package ex0215_map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	private Properties pro = new Properties();
	public PropertiesExam() {
		pro.setProperty("id", "jang");
		pro.setProperty("Age", "20");
		pro.setProperty("addr", "서울");
		
	}
	
	/**
	 * 외부 ~.properties파일을 로딩하는 방법 2가지
	 * 1) IO를 이용한 방법
	 * 2) ResourceBundle객체를 이용하는 방법
	 */
	
	// 1) IO를 이용한 방법
	public void test1() {
		pro.clear(); // 비우기
		try {
			pro.load(new FileInputStream("src/ex0215_map/test.properties"));
			for(String k : pro.stringPropertyNames()) {
				String v = pro.getProperty(k);
				System.out.println(k + " : " + v);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 2) ResourceBundle객체를 이용하는 방법
	public void test2() {
		pro.clear(); // 비우기
		ResourceBundle rb = ResourceBundle.getBundle("ex0215_map/test"); // test.properties
		for(String k : rb.keySet()) {
			String v = rb.getString(k);
			System.out.println(k + " : " + v);
		}
	}
	
	public static void main(String[] args) {
		PropertiesExam pe = new PropertiesExam();
		pe.test2();
	}
}

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
		pro.setProperty("addr", "����");
		
	}
	
	/**
	 * �ܺ� ~.properties������ �ε��ϴ� ��� 2����
	 * 1) IO�� �̿��� ���
	 * 2) ResourceBundle��ü�� �̿��ϴ� ���
	 */
	
	// 1) IO�� �̿��� ���
	public void test1() {
		pro.clear(); // ����
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
	
	// 2) ResourceBundle��ü�� �̿��ϴ� ���
	public void test2() {
		pro.clear(); // ����
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

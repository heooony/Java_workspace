package ex0218.io;

import java.util.Properties;

public class SystemPropertyExam {
	public SystemPropertyExam() {
		Properties pro = System.getProperties();
		for(Object key : pro.keySet()) {
			String value = System.getProperty(String.valueOf(key));
			System.out.println(key + " : " + value);
		}
	}
	
	public static void main(String[] args) {
		new SystemPropertyExam();
	}
}

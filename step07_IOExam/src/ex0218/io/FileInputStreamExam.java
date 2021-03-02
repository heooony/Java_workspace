package ex0218.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamExam {
	public FileInputStreamExam() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/ex0218/io/test.txt");
			int size = fis.available();
			byte b [] = new byte[size];
			fis.read(b);
			String name = new String(b);
			System.out.println(name);

			fos = new FileOutputStream("src/ex0218/io/newTextFile.txt");
			fos.write(65);
			fos.write(42);
			String data = "Á¹¸³´Ù.";
			fos.write(data.getBytes());
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputStreamExam();
	}
}
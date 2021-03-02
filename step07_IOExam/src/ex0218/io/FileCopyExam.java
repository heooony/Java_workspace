package ex0218.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam(String r, String w) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(r);
			fos = new FileOutputStream(w);
			
			int i = 0;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
		} catch(Exception e) {

		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("읽을 파일 명");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명");
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		new FileCopyExam(readFile, writeFile);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
}
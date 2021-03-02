package ex0218.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class FileCopyBufferedExam {
	public FileCopyBufferedExam(String r, String w) {
		try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(r));
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(w));)
		{	
			int i = 0;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
		} catch(Exception e) {

		} finally {

		}
	}
	
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("읽을 파일 명");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명");
		
		long startTime;
		long endTime;

		startTime = System.nanoTime();
		new FileCopyBufferedExam(readFile, writeFile);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
}
//C:\Users\oueya\Desktop\PHOTO\aa.png
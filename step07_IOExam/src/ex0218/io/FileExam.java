package ex0218.io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import javax.swing.JOptionPane;

public class FileExam {
	public FileExam() throws IOException {
		String fileName = JOptionPane.showInputDialog("파일 이름은?");
		File file = new File(fileName);
		if(file.isDirectory()) {
			System.out.println("=======" + fileName + "폴더 정보=======");
			String fnames [] = file.list();
			for(String name : fnames) {
				System.out.println(name);
			}
		} else {
			System.out.println("=======" + fileName + "파일 정보=======");
			System.out.println("읽기기능 = " + file.canRead());
			System.out.println("쓰기기능 = " + file.canWrite());
			System.out.println("파일이름 = " + file.getName());
			System.out.println("절대경로 = " + file.getAbsolutePath());
			System.out.println("파일크기 = " + file.length());
			System.out.println("마지막 수정일 = " + file.lastModified());
			
			System.out.println(new Date(file.lastModified()).toLocaleString());
		}
	}
	public static void main(String[] args) throws IOException{
		new FileExam();
	}
}
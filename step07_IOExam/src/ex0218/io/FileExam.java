package ex0218.io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import javax.swing.JOptionPane;

public class FileExam {
	public FileExam() throws IOException {
		String fileName = JOptionPane.showInputDialog("���� �̸���?");
		File file = new File(fileName);
		if(file.isDirectory()) {
			System.out.println("=======" + fileName + "���� ����=======");
			String fnames [] = file.list();
			for(String name : fnames) {
				System.out.println(name);
			}
		} else {
			System.out.println("=======" + fileName + "���� ����=======");
			System.out.println("�б��� = " + file.canRead());
			System.out.println("������ = " + file.canWrite());
			System.out.println("�����̸� = " + file.getName());
			System.out.println("������ = " + file.getAbsolutePath());
			System.out.println("����ũ�� = " + file.length());
			System.out.println("������ ������ = " + file.lastModified());
			
			System.out.println(new Date(file.lastModified()).toLocaleString());
		}
	}
	public static void main(String[] args) throws IOException{
		new FileExam();
	}
}
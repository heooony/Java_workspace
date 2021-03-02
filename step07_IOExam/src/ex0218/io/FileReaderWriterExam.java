package ex0218.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExam {
	public FileReaderWriterExam() {
		try (
			BufferedReader br = new BufferedReader(new FileReader("src/ex0218/io/test.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0218/io/test2.txt"));	
		) {
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			bw.write(23);
			bw.newLine();
			bw.write("¿Í¿ì~");
			bw.flush();
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new FileReaderWriterExam();
	}
}
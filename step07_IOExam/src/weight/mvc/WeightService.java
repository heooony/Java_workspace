package weight.mvc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WeightService {
	
	private WeightService() {}
	
	public static WeightService getInstance() {
		WeightService instance = new WeightService();
		return instance;
	}
	
	public void insertWeight(Person person) throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/weight/mvc/" + person.getName() + ".txt"))) {
			bw.write(person.getWeight() + ":" + person.getPassword());
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}
	
	public String searchWeight(Person person) throws IOException, IncorrectException {
		try (BufferedReader br = new BufferedReader(new FileReader("src/weight/mvc/" + person.getName() + ".txt"))) {
			String [] info = br.readLine().split(":");
			if(Integer.parseInt(info[1]) == person.getPassword())
				return info[0];
			else
				throw new IncorrectException();
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException(e.getMessage());
		}
	}
	
	public void modifyWeight(Person person) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("src/weight/mvc/" + person.getName() + ".txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/weight/mvc/" + person.getName() + ".txt"));
				) {
			System.out.println("\t변경할 몸무게를 입력하여 주십시요.");
			System.out.print("\t변경할 몸무게 : ");
			Scanner s = new Scanner(System.in);
			int modifyWeight = s.nextInt();
			bw.write(modifyWeight + ":" + person.getPassword());
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}
	
	public void modifyPassword(Person person) throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/weight/mvc/" + person.getName() + ".txt"))) {
			System.out.print("변경할 비밀번호 : ");
			Scanner s = new Scanner(System.in);
			int modifyPassword = s.nextInt();
			bw.write(person.getWeight() + ":" + modifyPassword);
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}
}

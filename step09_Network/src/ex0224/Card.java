package ex0224;

import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cardNum = s.nextLine();
		String validThru = s.nextLine();
		String firstName = s.nextLine();
		String lastName = s.nextLine();
		System.out.println("��������������������������������������");
		System.out.println("�� CREDIT CARD                                     ");
		System.out.println("��  ������                                                ");
		System.out.println("��  ���䦢                                                ");
		System.out.println("��  ������                                                ");
		System.out.println("��   " + cardNum + "        ");
		System.out.println("��                                          " + validThru + "       ");
		System.out.println("�� " + firstName + " " + lastName + "\t\tGOLD   ");
		System.out.println("��������������������������������������");
	}
}

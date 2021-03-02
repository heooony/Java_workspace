package ex0224;

import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cardNum = s.nextLine();
		String validThru = s.nextLine();
		String firstName = s.nextLine();
		String lastName = s.nextLine();
		System.out.println("忙式式式式式式式式式式式式式式式式式式");
		System.out.println("弛 CREDIT CARD                                     ");
		System.out.println("弛  忙式忖                                                ");
		System.out.println("弛  弛虫弛                                                ");
		System.out.println("弛  戌式戎                                                ");
		System.out.println("弛   " + cardNum + "        ");
		System.out.println("弛                                          " + validThru + "       ");
		System.out.println("弛 " + firstName + " " + lastName + "\t\tGOLD   ");
		System.out.println("戌式式式式式式式式式式式式式式式式式式");
	}
}

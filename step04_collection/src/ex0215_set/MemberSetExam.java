package ex0215_set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() {
		set.add(new Member("�赿��", 24, "����"));
		set.add(new Member("�谡��", 28, "�뱸"));
		set.add(new Member("�赿��", 24, "����"));
		
		System.out.println("����� ��ü �� : " + set.size());
	}
	
	public static void main(String[] args) {
		new MemberSetExam();
	}
}

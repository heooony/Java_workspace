package ex0215_set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() {
		set.add(new Member("±èµ¿Çå", 24, "¼­¿ï"));
		set.add(new Member("±è°¡¶÷", 28, "´ë±¸"));
		set.add(new Member("±èµ¿Çå", 24, "¼­¿ï"));
		
		System.out.println("ÀúÀåµÈ °´Ã¼ ¼ö : " + set.size());
	}
	
	public static void main(String[] args) {
		new MemberSetExam();
	}
}

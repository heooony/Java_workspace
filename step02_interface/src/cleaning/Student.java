package cleaning;

public class Student {
	static String student [];
	static String previousStudent [];
	static int studentLength;
	static int previousStudentLength;

	Student() {
		student = new String[]
				{
					"�赿��", "�赿��", "��μ�", "�輺��", "��ҿ�",
					"��¿�", "���ȯ", "������", "�ڱ���", "�ڼ���",
					"������", "������", "�ɱ���", "������", "�����",
					"�̽���", "������", "������", "�ּ���", "����ö",
					"������", "���Ƽ�", "Ȳ����"
				};
		studentLength = student.length;
		previousStudent = new String[studentLength];
	}
}

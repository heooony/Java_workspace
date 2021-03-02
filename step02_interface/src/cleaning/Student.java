package cleaning;

public class Student {
	static String student [];
	static String previousStudent [];
	static int studentLength;
	static int previousStudentLength;

	Student() {
		student = new String[]
				{
					"±èµ¿Çå", "±èµ¿Çö", "±è¹Î¼·", "±è¼ºÈñ", "±è¼Ò¿µ",
					"±è½Â¿ø", "±è½ÂÈ¯", "±èÁ¤Èñ", "¹Ú±âÇö", "¹Ú¼ºÁ¾",
					"¹èÀºÁø", "¼­Á¤¿ì", "½É±âÈÆ", "¿Àµ¿¼Ò", "¿ì¼öÇö",
					"ÀÌ½ÂÇö", "Á¶¹ÎÁÖ", "Â÷¿µ¿ì", "ÃÖ¼öºó", "ÃÖÀºÃ¶",
					"ÃÖÁ¤³²", "ÃÖÈÆ¼®", "È²º¸Çö"
				};
		studentLength = student.length;
		previousStudent = new String[studentLength];
	}
}

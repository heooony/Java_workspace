class ObjectExam{
	public ObjectExam(){   }
	public ObjectExam(String str){   }
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="¿Â»Ò¡§"; 
			String s02="Java";
			String s03=new String("ø˘ø‰¿œ");
			ObjectExam oe1=new ObjectExam();
			ObjectExam oe2=new ObjectExam("æ»≥Á");
			System.out.println(c);//
			System.out.println(s01);//
			System.out.println(s02);//
			System.out.println(s03);//
			System.out.println(oe1);//
			System.out.println(oe2);//
			
	}
}

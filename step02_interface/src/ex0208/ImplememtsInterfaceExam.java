package ex0208;

//�� �ҽ��� �������� �ǵ��� ����/�߰�/�ּ�ó�� �ϼ���.
interface InterfaceExam00{
	abstract void interfaceExam00();
}


interface InterfaceExam01 extends InterfaceExam00{
	static final int i = 767;
	static final int k = 999;
	
	void interfaceExam01(int i, int k);
}



interface InterfaceExam02{
	static final int j =747;
	static final int privateInt = 8; 
	void interfaceExam02(int j); 
	
}



class SuperClassExam{
	String superString = "Super";

	String superMethod(){
		System.out.println("SuperClassExam.SuperMethod()�� ȣ��Ǿ����ϴ�.");
		return "returnString";
	}
}

class SubClassExam01 extends SuperClassExam implements InterfaceExam01{

	@Override
	public void interfaceExam00() {
		
	}

	@Override
	public void interfaceExam01(int i, int k) {
		
	}
} 



 class SubClassExam02 extends SuperClassExam 
				implements InterfaceExam01, InterfaceExam02{
	 
	@Override
	public void interfaceExam00() {
		
	}

	@Override
	public void interfaceExam02(int j) {
		
	}

	@Override
	public void interfaceExam01(int i, int k) {
		
	}
}


abstract class SubClassExam03 
			extends SuperClassExam implements InterfaceExam01, InterfaceExam02{}
			

class SubClassExam04 extends SubClassExam02{
	//���⿡ �ʿ��� �͵��� �߰��Ͽ� ������ �ذ��ϼ���..
	public void interfaceExam00(){}
	public void interfaceExam01(int i, int k){}
	public void interfaceExam02(int j){}

	SubClassExam04(){
		System.out.println("subClassExam04() ��ü ����");
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	SubClassExam04(String s1, String s2){
		System.out.println(s1+" Ÿ�� "+"subClassExam04("+s2+") ��ü ����");
		
	}
	void printSuperString(){
		InterfaceExam01 ie01 = new SubClassExam01(); 
		

		System.out.println(" superString = "+superString);
	}
}

//���⼭���ʹ� �ϳ��� ��ġ�� ���ð� �״�� ���� �˴ϴ�.
public class ImplememtsInterfaceExam{ 
	public static void main(String args[]){		
		SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
		SuperClassExam  superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
		InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		SubClassExam04 sub04 = new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1,7);
		sub04.superMethod();
	}
}


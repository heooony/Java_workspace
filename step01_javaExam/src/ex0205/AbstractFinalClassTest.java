package ex0205;

class FinalClassExam{
	final int i = 100;
}

abstract class AbstractClassExam{
    abstract String abstractMethodExam(int i,String s);    
    int finalMethodExam(int i, int j){ 
        return i+j;
    }
}

class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	int finalMethodExam(int i, int j){
		return i*j;
	}
	
}

class Sample02 extends FinalClassExam{}


 
class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }

	void sampleMethod03(){
		System.out.println("void sampleMethod03() ȣ�� ��");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace;
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}

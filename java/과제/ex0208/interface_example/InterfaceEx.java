package interface_example;

public interface InterfaceEx {
	public void methodA();
}

interface InterfaceEx2 {
	public void methodB();
}

interface InterfaceEx3 extends InterfaceEx, InterfaceEx2 {
	public void methodC();
}

class ImplementationC implements InterfaceEx, InterfaceEx2, InterfaceEx3 {

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}
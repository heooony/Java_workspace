package interface_example;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceEx ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceEx2 ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceEx3 ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}

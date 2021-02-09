class ArrayExam {
	public static void main(String[] args) {

		int sum = 0;

		if(args.length > 0)
			for(String s : args)
				sum += Integer.parseInt(s);

		System.out.print(sum);
	}
}

class Test {
	Test t; //null
	Test [] tarr; //null

	Test t= new Test();
	Test [] tarr = new Test [3];
	
	tarr[0] = new Test();
}
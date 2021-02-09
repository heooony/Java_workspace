class CarCenter{
	public void engineer(Car cd){
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
		if(Carnival instanceof cd) {
			Carnival ca = (Carnival)cd;
			System.out.println("실행");
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
		System.out.println("ca = " + ca);
		System.out.println("ca.a = " + ca.a);
		cc.engineer(c);
		cc.engineer(ef);
		cc.engineer(ca);
		cc.engineer(ex);
		
	}
}
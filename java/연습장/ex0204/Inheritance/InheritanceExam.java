
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

class EfSonata extends Car{
	EfSonata() {
		carname = "EfSonata";
		cost = 1000;
	}
}
	
class Excel extends Car{
	Excel() {
		carname = "Excel";
		cost = 2000;
	}
}

class Carnival extends Car{
	int a = 100;
	Carnival() {
		carname = "Carnival";
		cost = 3000;
	}
}	



/**
	전자제품을 관리하는 객체
	등록, 수정, 전체검색, 부분검색 기능을 담당하는 클래스
*/

public class ElectronicsService {
	private static ElectronicsService instance;
	Electronics elecArr[];
	public static int count;
	String [][] data = new String [][] {
			{"10", "선풍기", "20000" ,"선풍기 너무 시원해요"},
			{"20", "에어컨", "300000" ,"삼성 무풍 에어컨"},
			{"30", "한갈세", "119900" ,"하 먹고싶다."},
			{"40", "부채살", "23000" ,"그냥 부채하다 생각남"},
			{"50", "안창살", "12000" ,"아버지가 좋아하는 부위"},
		};

	private ElectronicsService() {
		elecArr = new Electronics[100];
		count = data.length;
		for(int i = 0; i < data.length; i++) {
			elecArr[i] = new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]);
		}
	}

	public static ElectronicsService getInstance() {
		instance = new ElectronicsService();
		return instance;
	}

	/**
		0, 중복
		1, 등록 성공
		2, 배열의 길이를 벗어남
	*/
	public int insert(Electronics electronics) {

		for(int i = 0; i < count; i++)
			if(elecArr[i].getModelNo() == electronics.getModelNo())
				return 0;

		if(count < 100) {
			elecArr[count++] = electronics;
			return 1; 
		} else {
			return 2;
		}
		
	}

	public Electronics[] selectAll() {
		return elecArr;
	}

	public Electronics searchByModelNo(int modelNo) {
		for(int i = 0; i < count; i++)
			if(elecArr[i].getModelNo() == modelNo)
				return elecArr[i];
		return null;
	}

	public boolean update(Electronics electronics) {
		Electronics newElectronics = searchByModelNo(electronics.getModelNo());
		if(newElectronics != null) {
			newElectronics.setModelDetail(electronics.getModelDetail());
			return true;
		} else {
			return false;
		}	
	}

	public boolean delete(int modelNo) {
		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelNo() == modelNo) {
				elecArr[i] = elecArr[count-1];
				count--;
				return true;
			}
		}
		return false;
	}

	public Electronics[] purchase(int money) {
		
		int arrCount = 0;
		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelPrice() <= money) {
				arrCount++;
			}
		}

		Electronics[] electronicsArray = new Electronics [arrCount];

		arrCount = 0;

		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelPrice() <= money) {
				electronicsArray[arrCount++] = elecArr[i];
			}
		}

		return electronicsArray;
	}
}
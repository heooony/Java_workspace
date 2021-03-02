package mvc;

import java.util.ArrayList;
import java.util.List;

import mvc.exception.DMLException;
import mvc.exception.DuplicateException;
import mvc.exception.SearchNotFoundException;

/**
	전자제품을 관리하는 객체
	등록, 수정, 전체검색, 부분검색 기능을 담당하는 클래스
*/

public class ElectronicsService {
	private static ElectronicsService instance;
	List<Electronics> elecArr;
	List<Electronics> data = new ArrayList<Electronics> (5) {
			{
				add(new Electronics(10, "선풍기", 20000 ,"선풍기 너무 시원해요"));
				add(new Electronics(20, "에어컨", 300000 ,"삼성 무풍 에어컨"));
				add(new Electronics(30, "한갈세", 119900 ,"하 먹고싶다."));
				add(new Electronics(40, "부채살", 23000 ,"그냥 부채하다 생각남"));
				add(new Electronics(50, "안창살", 12000 ,"아버지가 좋아하는 부위"));
			}
		};

	private ElectronicsService() {
		elecArr = new ArrayList<Electronics>();
		for(int i = 0; i < data.size(); i++)
			elecArr.add(data.get(i));
	}

	public static ElectronicsService getInstance() {
		instance = new ElectronicsService();
		return instance;
	}

	/**
		0, 중복
		1, 등록 성공
		2, 배열의 길이를 벗어남
	 * @throws DMLException 
	 * @throws DuplicateException 
	*/
	public void insert(Electronics electronics) throws DMLException, DuplicateException {

		for(int i = 0; i < elecArr.size(); i++)
			if(elecArr.get(i).getModelNo() == electronics.getModelNo())
				throw new DuplicateException(electronics.getModelNo() + "번호는 중복입니다.");

		if(elecArr.size() < 100) {
			elecArr.add(electronics);
		} else {
			throw new DMLException("더 이상 제품을 추가할 수 없습니다.");
		}
		
	}

	public List<Electronics> selectAll() {
		return elecArr;
	}

	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(int i = 0; i < elecArr.size(); i++)
			if(elecArr.get(i).getModelNo() == modelNo)
				return elecArr.get(i);
		throw new SearchNotFoundException("해당 모델이 존재하지 않습니다.");
	}

	public void update(Electronics electronics) throws SearchNotFoundException {
		Electronics newElectronics = searchByModelNo(electronics.getModelNo());
		newElectronics.setModelDetail(electronics.getModelDetail());
	}

	public boolean delete(int modelNo) {
		for(int i = 0; i < elecArr.size(); i++) {
			if(elecArr.get(i).getModelNo() == modelNo) {
				elecArr.remove(i);
				return true;
			}
		}
		return false;
	}

	public Electronics[] purchase(int money) {
		
		int arrCount = 0;
		for(int i = 0; i < elecArr.size(); i++) {
			if(elecArr.get(i).getModelPrice() <= money) {
				arrCount++;
			}
		}

		Electronics[] electronicsArray = new Electronics [arrCount];

		arrCount = 0;

		for(int i = 0; i < elecArr.size(); i++) {
			if(elecArr.get(i).getModelPrice() <= money) {
				electronicsArray[arrCount++] = elecArr.get(i);
			}
		}

		return electronicsArray;
	}
}
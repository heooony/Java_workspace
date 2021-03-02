package mvc;

import java.util.ArrayList;
import java.util.List;

import mvc.exception.DMLException;
import mvc.exception.DuplicateException;
import mvc.exception.SearchNotFoundException;

/**
	������ǰ�� �����ϴ� ��ü
	���, ����, ��ü�˻�, �κа˻� ����� ����ϴ� Ŭ����
*/

public class ElectronicsService {
	private static ElectronicsService instance;
	List<Electronics> elecArr;
	List<Electronics> data = new ArrayList<Electronics> (5) {
			{
				add(new Electronics(10, "��ǳ��", 20000 ,"��ǳ�� �ʹ� �ÿ��ؿ�"));
				add(new Electronics(20, "������", 300000 ,"�Ｚ ��ǳ ������"));
				add(new Electronics(30, "�Ѱ���", 119900 ,"�� �԰�ʹ�."));
				add(new Electronics(40, "��ä��", 23000 ,"�׳� ��ä�ϴ� ������"));
				add(new Electronics(50, "��â��", 12000 ,"�ƹ����� �����ϴ� ����"));
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
		0, �ߺ�
		1, ��� ����
		2, �迭�� ���̸� ���
	 * @throws DMLException 
	 * @throws DuplicateException 
	*/
	public void insert(Electronics electronics) throws DMLException, DuplicateException {

		for(int i = 0; i < elecArr.size(); i++)
			if(elecArr.get(i).getModelNo() == electronics.getModelNo())
				throw new DuplicateException(electronics.getModelNo() + "��ȣ�� �ߺ��Դϴ�.");

		if(elecArr.size() < 100) {
			elecArr.add(electronics);
		} else {
			throw new DMLException("�� �̻� ��ǰ�� �߰��� �� �����ϴ�.");
		}
		
	}

	public List<Electronics> selectAll() {
		return elecArr;
	}

	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(int i = 0; i < elecArr.size(); i++)
			if(elecArr.get(i).getModelNo() == modelNo)
				return elecArr.get(i);
		throw new SearchNotFoundException("�ش� ���� �������� �ʽ��ϴ�.");
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
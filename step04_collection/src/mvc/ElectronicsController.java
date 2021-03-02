package mvc;

import mvc.exception.DMLException;
import mvc.exception.DuplicateException;
import mvc.exception.SearchNotFoundException;

/**
	View�� Model ���̿��� �߰��� ����
	����� ��û(view)�� �޾� �� ��û�� �ش��ϴ� Model(Service)�� ȣ���ϰ�,
	ȣ��� ����� �ٽ� �޾Ƽ� �� ����� ���� View�� ȣ���Ѵ�.
*/
public class ElectronicsController {
	private ElectronicsService service;

	public ElectronicsController() {
		service = ElectronicsService.getInstance();
	}

	public void insert(Electronics electronics) {
		try {
			service.insert(electronics);
			EndView.printMessage("��ϵǾ����ϴ�.");
		} catch (DMLException  | DuplicateException e) {
			EndView.printMessage(e.getMessage());
		}
		
	}

	public void selectAll() {
		EndView.printAll(service.selectAll());
	}

	public void searchByModelNo(int modelNo) {
		try {
			Electronics electronics = service.searchByModelNo(modelNo);
			EndView.printSearchByNodelNo(electronics);
		} catch(SearchNotFoundException e) {
			EndView.printMessage(e.getMessage());
		}
	}

	public void update(Electronics electronics) {
		try {
			service.update(electronics);
			EndView.printMessage("������ �Ϸ��߽��ϴ�.");
		} catch(SearchNotFoundException e) {
			EndView.printMessage(e.getMessage());
		}
	}

	public void delete(int modelNo) {
		if(service.delete(modelNo)) {
			EndView.printMessage("�����߽��ϴ�.");
		} else {
			EndView.printMessage("�ش��ϴ� ������ �����ϴ�.");
		}
	}

	public void purchase(int money) {
		Electronics [] electronics = service.purchase(money);
		if(electronics.length != 0) {
			EndView.printPurchaseList(electronics);
		} else {
			EndView.printMessage("�ƹ� �͵� �� �� �����ϴ�.");
		}
	}
}
package mvc;

import mvc.exception.DMLException;
import mvc.exception.DuplicateException;
import mvc.exception.SearchNotFoundException;

/**
	View와 Model 사이에서 중간자 역할
	사용자 요청(view)을 받아 그 요청에 해당하는 Model(Service)을 호출하고,
	호출된 결과를 다시 받아서 그 결과에 따른 View를 호출한다.
*/
public class ElectronicsController {
	private ElectronicsService service;

	public ElectronicsController() {
		service = ElectronicsService.getInstance();
	}

	public void insert(Electronics electronics) {
		try {
			service.insert(electronics);
			EndView.printMessage("등록되었습니다.");
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
			EndView.printMessage("수정을 완료했습니다.");
		} catch(SearchNotFoundException e) {
			EndView.printMessage(e.getMessage());
		}
	}

	public void delete(int modelNo) {
		if(service.delete(modelNo)) {
			EndView.printMessage("삭제했습니다.");
		} else {
			EndView.printMessage("해당하는 정보가 없습니다.");
		}
	}

	public void purchase(int money) {
		Electronics [] electronics = service.purchase(money);
		if(electronics.length != 0) {
			EndView.printPurchaseList(electronics);
		} else {
			EndView.printMessage("아무 것도 살 수 없습니다.");
		}
	}
}
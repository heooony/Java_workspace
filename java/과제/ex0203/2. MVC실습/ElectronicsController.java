

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
		int num = service.insert(electronics);
		if(num == 1) {
			EndView.printMessage("성공했습니다.");
		} else if(num == 2){
			EndView.printMessage("목록 리스트가 가득 찼습니다.");
		} else {
			EndView.printMessage("중복된 모델 번호입니다.");
		}
	}

	public void selectAll() {
		EndView.printAll(service.selectAll());
	}

	public void searchByModelNo(int modelNo) {
		Electronics electronics = service.searchByModelNo(modelNo);
		if(electronics != null) {
			EndView.printSearchByNodelNo(electronics);
		} else {
			EndView.printMessage("해당하는 정보가 없습니다.");
		}
	}

	public void update(Electronics electronics) {
		if(service.update(electronics)) {
			EndView.printMessage("업데이트에 성공했습니다..");
		} else {
			EndView.printMessage("업데이트에 실패했습니다.");
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
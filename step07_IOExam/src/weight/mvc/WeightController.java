package weight.mvc;

import java.io.IOException;

public class WeightController {
	WeightService service;
	
	public WeightController() {
		service = WeightService.getInstance();
	}
	
	public void insertWeight(Person person) {
		try {
			service.insertWeight(person);
			SuccessView.printMessage("정보가 등록되었습니다!");
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : 오류가 발생했습니다.");
		}
	}
	
	public void searchWeight(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printWeight(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : 파일이 존재하지 않습니다.");
		} catch (IncorrectException e) {
			FailView.printMessage("비밀번호가 일치하지 않습니다.");
		} catch (Exception e) {
			FailView.printMessage(e.getMessage() + " : 파일 안의 형식이 잘못되었습니다.");
		}
	}
	
	public void modifyWeight(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printWeight(person);
			service.modifyWeight(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : 파일이 존재하지 않습니다.");
		} catch (IncorrectException e) {
			FailView.printMessage("비밀번호가 일치하지 않습니다.");
		} 
	}
	
	public void modifyPassword(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printPassword(person);
			service.modifyPassword(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : 파일이 존재하지 않습니다.");
		} catch (IncorrectException e) {
			FailView.printMessage("비밀번호가 일치하지 않습니다.");
		} 
	}
}

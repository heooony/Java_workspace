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
			SuccessView.printMessage("������ ��ϵǾ����ϴ�!");
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : ������ �߻��߽��ϴ�.");
		}
	}
	
	public void searchWeight(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printWeight(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : ������ �������� �ʽ��ϴ�.");
		} catch (IncorrectException e) {
			FailView.printMessage("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			FailView.printMessage(e.getMessage() + " : ���� ���� ������ �߸��Ǿ����ϴ�.");
		}
	}
	
	public void modifyWeight(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printWeight(person);
			service.modifyWeight(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : ������ �������� �ʽ��ϴ�.");
		} catch (IncorrectException e) {
			FailView.printMessage("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} 
	}
	
	public void modifyPassword(Person person) {
		try {
			String weight = service.searchWeight(person);
			person.setWeight(Integer.parseInt(weight));
			SuccessView.printPassword(person);
			service.modifyPassword(person);
		} catch (IOException e) {
			FailView.printMessage(e.getMessage() + " : ������ �������� �ʽ��ϴ�.");
		} catch (IncorrectException e) {
			FailView.printMessage("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} 
	}
}

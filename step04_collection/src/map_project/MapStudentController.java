package map_project;

public class MapStudentController {
	static MapStudentService service = new MapStudentService();
	
	public MapStudentController() {
		
	}
	
	public static void selectAll() {
		EndView.printAll(service.selectAll());
	}
	
	public static void searchById(String key) {
		Person person = service.searchByKey(key);
		if(person != null) {
			EndView.printSearch(person);
		} else {
			EndView.printMessage("�ش��ϴ� ���̵� �����ϴ�.");
		}
	}
	
	public static void insert(Person person) {
		try {
			service.insert(person);
			EndView.printMessage("���������� ��ϵǾ����ϴ�.");
		} catch (RuntimeException e) {
			EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");
		}
	}
	
	public static void delete(String key) {
		try {
			service.delete(key);
			EndView.printMessage("���������� �����Ǿ����ϴ�.");
		} catch (RuntimeException e) {
			EndView.printMessage("�������� �ʾҽ��ϴ�.");
		}
	}
	
	public static void update(Person person) {
		try {
			service.update(person);
			EndView.printMessage("���������� �����Ǿ����ϴ�.");
		} catch(RuntimeException e) {
			EndView.printMessage("�������� �ʾҽ��ϴ�.");
		}
	}
}

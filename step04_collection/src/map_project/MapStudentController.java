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
			EndView.printMessage("해당하는 아이디가 없습니다.");
		}
	}
	
	public static void insert(Person person) {
		try {
			service.insert(person);
			EndView.printMessage("정상적으로 등록되었습니다.");
		} catch (RuntimeException e) {
			EndView.printMessage("등록되지 않았습니다.");
		}
	}
	
	public static void delete(String key) {
		try {
			service.delete(key);
			EndView.printMessage("정상적으로 삭제되었습니다.");
		} catch (RuntimeException e) {
			EndView.printMessage("삭제되지 않았습니다.");
		}
	}
	
	public static void update(Person person) {
		try {
			service.update(person);
			EndView.printMessage("정상적으로 수정되었습니다.");
		} catch(RuntimeException e) {
			EndView.printMessage("수정되지 않았습니다.");
		}
	}
}

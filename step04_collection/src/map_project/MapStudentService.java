package map_project;

import java.util.HashMap;
import java.util.Map;

public class MapStudentService {
	private Map<String, Person> map = new HashMap<String, Person>();
	public MapStudentService() {
		map.put("kim", this.create("kim", "김동헌", 24, 90, 87, 96));
		map.put("lee", this.create("lee", "이영표", 50));
		map.put("jang", this.create("jang", "장사꾼", 42));
		map.put("king", this.create("king", "박지성", 30, 78, 85, 48));
		map.put("choi", this.create("choi", "최정", 35));
	}
	
	/**
	 * map에 저장할 객체를 생성해서 리턴해주는 메소드
	 */
	public Person create(String id, String name, int age, int ...params) {
		if(params.length == 0) {
			return new Person(id, name, age);
		} else if(params.length == 3) { 
			return new Student(id, name, age, params[0], params[1], params[2]);
		} else {
			throw new RuntimeException("전달된 인수가 잘못되어 생성할 수 없습니다.");
		}
	}
	
	/**
	 * 전체 검색
	 */
	public Map<String, Person> selectAll() {
		return map;
	}

	/**
	 * key에 해당하는 정보 검색
	 *   :key해당하는 정보를 출력할때 
	 *    [ Person인경우는 이름만 출력
	 *     Student인경우는 이름과 총점 출력 ] -> EndView에서 
	 *     없는경우는 "id는 없습니다." 예외발생
	 * */
	public Person searchByKey(String key) {
		if(map.containsKey(key)) {
			Person person = map.get(key);
			return person;
		} else {
			return null;
		}
	}
	
	/**
	 * 등록 : key와 Person의 정보를 받아 등록하는 메소드
	 *        등록이 실패하면(id중복체크!!) 예외발생시킨다.("등록되지 않았습니다.")
	 * */
	public void insert(Person person) {
		if(map.containsKey(person.getId())) {
			throw new RuntimeException();
		}
		map.put(person.getId(), person);
	}


	/**
	 *  삭제
	 *   : id에 해당하는 value가 삭제되지 않으면 예외발생
	 *      (삭제되지 않았습니다.)
	 * */
	public void delete(String key) {
		if(!map.containsKey(key)) {
			throw new RuntimeException();
		}
		map.remove(key);
	}

	/**
	 * 수정
	 *   만약, Person인경우 - 이름만 수정
	 *         Student인경우  - 이름, 국어 ,영어,수학수정(총점 변경)
	 *    수정이 안된다면 예외발생
	 *    인수로 전달된 객체타입과 key에 해당하는 객체 타입이 일치할 때
	 *    수정해야 한다. 만약 인수는 Student인데 key의 찾은 객체가 Person이라면
	 *    수정하면 안 된다.
	 * */
	public void update(Person person) {
		if(!map.get(person.getId()).getClass().getName().equals(person.getClass().getName())) {
			throw new RuntimeException();
		}
		if(person instanceof Student) {
			Student student = (Student) person;
			map.put(person.getId(), student);
		} else {
			map.put(person.getId(), person);
		}
	}
}

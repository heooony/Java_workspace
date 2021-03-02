package map_project;

import java.util.HashMap;
import java.util.Map;

public class MapStudentService {
	private Map<String, Person> map = new HashMap<String, Person>();
	public MapStudentService() {
		map.put("kim", this.create("kim", "�赿��", 24, 90, 87, 96));
		map.put("lee", this.create("lee", "�̿�ǥ", 50));
		map.put("jang", this.create("jang", "����", 42));
		map.put("king", this.create("king", "������", 30, 78, 85, 48));
		map.put("choi", this.create("choi", "����", 35));
	}
	
	/**
	 * map�� ������ ��ü�� �����ؼ� �������ִ� �޼ҵ�
	 */
	public Person create(String id, String name, int age, int ...params) {
		if(params.length == 0) {
			return new Person(id, name, age);
		} else if(params.length == 3) { 
			return new Student(id, name, age, params[0], params[1], params[2]);
		} else {
			throw new RuntimeException("���޵� �μ��� �߸��Ǿ� ������ �� �����ϴ�.");
		}
	}
	
	/**
	 * ��ü �˻�
	 */
	public Map<String, Person> selectAll() {
		return map;
	}

	/**
	 * key�� �ش��ϴ� ���� �˻�
	 *   :key�ش��ϴ� ������ ����Ҷ� 
	 *    [ Person�ΰ��� �̸��� ���
	 *     Student�ΰ��� �̸��� ���� ��� ] -> EndView���� 
	 *     ���°��� "id�� �����ϴ�." ���ܹ߻�
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
	 * ��� : key�� Person�� ������ �޾� ����ϴ� �޼ҵ�
	 *        ����� �����ϸ�(id�ߺ�üũ!!) ���ܹ߻���Ų��.("��ϵ��� �ʾҽ��ϴ�.")
	 * */
	public void insert(Person person) {
		if(map.containsKey(person.getId())) {
			throw new RuntimeException();
		}
		map.put(person.getId(), person);
	}


	/**
	 *  ����
	 *   : id�� �ش��ϴ� value�� �������� ������ ���ܹ߻�
	 *      (�������� �ʾҽ��ϴ�.)
	 * */
	public void delete(String key) {
		if(!map.containsKey(key)) {
			throw new RuntimeException();
		}
		map.remove(key);
	}

	/**
	 * ����
	 *   ����, Person�ΰ�� - �̸��� ����
	 *         Student�ΰ��  - �̸�, ���� ,����,���м���(���� ����)
	 *    ������ �ȵȴٸ� ���ܹ߻�
	 *    �μ��� ���޵� ��üŸ�԰� key�� �ش��ϴ� ��ü Ÿ���� ��ġ�� ��
	 *    �����ؾ� �Ѵ�. ���� �μ��� Student�ε� key�� ã�� ��ü�� Person�̶��
	 *    �����ϸ� �� �ȴ�.
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

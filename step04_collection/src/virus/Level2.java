package virus;

public class Level2 extends Level1 {
	Object object;
	public Level2() {
		information = "2�ܰ� : ���� ����, �޼� ����, ������ Ȯ�� ����";
	}
	
	//	�߸��� ���� 1 : �ڴ�� Override�ϴ� ���
	@Override
	public void introduce() {
		System.out.println("2�ܰ� : ���� ����, �޼� ����, ������ Ȯ�� ����");
	}
	
	// �߸��� ���� 2 : �θ� Ŭ������ ����� ��ȭ��Ű�� ���
	@Override
	public void checkLevel(int num) {
		if(300 <= num) {
			System.out.println("2�ܰ� �Դϴ�.");
		} else {
			System.out.println("2�ܰ� �� �Ʒ��Դϴ�.");
		}
	}
}

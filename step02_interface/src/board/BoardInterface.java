package board;

public interface BoardInterface {
	/**
	 * ���
	 */
	boolean insert(BoardVo board);
	/**
	 * ����
	 */
	boolean update(BoardVo board);
	/**
	 * �۹�ȣ�� ����ϴ� ���� �˻�
	 */
	BoardVo selectByNo(int no);
	/**
	 * ����
	 */
	default boolean delete(int no) {
		System.out.println("BoardInterface�� �����Դϴ�.");
		return false;
	}; 
	
	static BoardVo[] selectAll() {
		System.out.println("selece all�Դϴ�.");
		return null;
	}
	
}

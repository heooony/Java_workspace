package board;

public interface BoardInterface {
	/**
	 * 등록
	 */
	boolean insert(BoardVo board);
	/**
	 * 수정
	 */
	boolean update(BoardVo board);
	/**
	 * 글번호헤 햐당하는 정보 검색
	 */
	BoardVo selectByNo(int no);
	/**
	 * 삭제
	 */
	default boolean delete(int no) {
		System.out.println("BoardInterface의 삭제입니다.");
		return false;
	}; 
	
	static BoardVo[] selectAll() {
		System.out.println("selece all입니다.");
		return null;
	}
	
}

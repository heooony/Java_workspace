package board;

public class QABoardImpl implements BoardInterface{

	@Override
	public boolean insert(BoardVo board) {
		System.out.println("QABoardImpl�� insert");
		return false;
	}

	@Override
	public boolean update(BoardVo board) {
		System.out.println("QABoardImpl�� update");
		return false;
	}

	@Override
	public BoardVo selectByNo(int no) {
		System.out.println("QABoardImpl�� selectByNo�Դϴ�.");
		return null;
	}

}

package board;

public class FreeBoardImpl implements BoardInterface{

	@Override
	public boolean insert(BoardVo board) {
		System.out.println("FreeBoardImpl�� insert");
		return false;
	}

	@Override
	public boolean update(BoardVo board) {
		System.out.println("FreeBoardImpl�� update");
		return false;
	}

	@Override
	public BoardVo selectByNo(int no) {
		System.out.println("FreeBoardImpl�� selectByNo�Դϴ�.");
		return null;
	}

}

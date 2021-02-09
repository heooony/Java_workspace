package board;

public class FreeBoardImpl implements BoardInterface{

	@Override
	public boolean insert(BoardVo board) {
		System.out.println("FreeBoardImpl의 insert");
		return false;
	}

	@Override
	public boolean update(BoardVo board) {
		System.out.println("FreeBoardImpl의 update");
		return false;
	}

	@Override
	public BoardVo selectByNo(int no) {
		System.out.println("FreeBoardImpl의 selectByNo입니다.");
		return null;
	}

}

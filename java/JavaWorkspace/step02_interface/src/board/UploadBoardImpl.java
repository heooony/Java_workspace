package board;

public class UploadBoardImpl implements BoardInterface{

	@Override
	public  boolean insert(BoardVo board) {
		System.out.println("UploadBoardmpl의 insert");
		return false;
	}

	@Override
	public  boolean update(BoardVo board) {
		System.out.println("UploadBoardmpl의 update");
		return false;
	}

	@Override
	public  BoardVo selectByNo(int no) {
		System.out.println("UploadBoardmp3의 selectByNo입니다.");
		return null;
	}
	
	@Override
	public boolean delete(int no) {
		System.out.println("UploadBoardmp3의 selectByNo입니다.");
		return false;
	}

}

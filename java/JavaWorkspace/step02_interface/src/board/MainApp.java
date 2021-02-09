package board;

public class MainApp {
	public static void main(String[] args) {
		BoardInterface board = null;
		board = new FreeBoardImpl();
		test(board);
		
		System.out.println("-----------------");
		board = new QABoardImpl();
		test(board);
		
		System.out.println("-----------------");
		board = new UploadBoardImpl();
		test(board);
		
	}
	
	public static void test(BoardInterface board) {
		board.insert(new BoardVo(10, "java", "¿⁄πŸ ¿Áπ’¥Ÿ", "¿Â»Ò¡§"));
		board.update(new BoardVo());
		board.selectByNo(13);
		board.delete(10);
		BoardInterface.selectAll();
	}
}

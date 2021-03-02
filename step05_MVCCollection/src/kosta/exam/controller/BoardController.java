package kosta.exam.controller;

import java.util.Map;
import kosta.exam.dto.Board;
import kosta.exam.exception.DuplicateException;
import kosta.exam.exception.InexistentException;
import kosta.exam.service.BoardService;
import kosta.exam.service.BoardServiceImpl;
import kosta.exam.view.FailView;
import kosta.exam.view.SuccessView;

public class BoardController {
	private static BoardService boardService = BoardServiceImpl.getInstance();
	public BoardController() {}
	
	public static void getAllBoard() {
		try {
			Map<String, Map<String, Board>> map = boardService.getBoardList();
			if(map == null) {
				throw new InexistentException();
			} else {
				SuccessView.printBoard(map);
			}
		} catch (InexistentException e) {
			FailView.errorMessage("게시물이 존재하지 않습니다.");
		}
	}
	
	public static void getBoardByKind(String kind) {
		try {
			Map<String, Board> map = boardService.getBoardByKind(kind);
			SuccessView.printBoardByKind(kind, map);
		} catch(InexistentException e) {
			FailView.errorMessage("존재하지 않는 유형입니다.");
		}
	}
	
	public static void getBoardByNo(String kind, int no) {
		try {
			Board board = boardService.getBoardByNo(kind, no);
			SuccessView.printBoardByNo(board);
		} catch(InexistentException e) {
			if(e.getMessage().equals(kind))
				FailView.errorMessage("존재하지 않는 유형입니다.");
			else if(e.getMessage().equals(Integer.toString(no))) {
				FailView.errorMessage("존재하지 않는 글 번호입니다.");
			}
		}
	}
	
	public static void insertBoard(String kind, Board board) {
		try {
			if(boardService.insertBoard(kind, board)) {
				SuccessView.printMessage("성공적으로 등록되었습니다.");
			}
		} catch(DuplicateException e) {
			FailView.errorMessage("이미 존재하는 글 번호입니다.");
		} catch (InexistentException e) {
			FailView.errorMessage("존재하지 않는 유형입니다.");
		}
	}
	
	public static void deleteBoard(String kind, int no) {
		try {
			if(boardService.deleteBoard(kind, no)) {
				SuccessView.printMessage("성공적으로 삭제되었습니다.");
			} else {
				FailView.errorMessage("존재하지 않는 글 번호입니다.");
			}
		} catch (InexistentException e) {
			FailView.errorMessage("존재하지 않는 유형입니다.");
		}
	}

	public static void updateBoard(Board board, String kind) {
		try {
			if(boardService.updateBoard(board, kind)) {
				SuccessView.printMessage("성공적으로 수정되었습니다.");
			} else {
				FailView.errorMessage("존재하지 않는 글 번호입니다.");
			}
		} catch (InexistentException e) {
			FailView.errorMessage("존재하지 않는 유형입니다.");
		}
	}
}
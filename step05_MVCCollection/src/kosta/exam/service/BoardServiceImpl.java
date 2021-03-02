package kosta.exam.service;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import kosta.exam.dto.ArchiveBoard;
import kosta.exam.dto.Board;
import kosta.exam.dto.PhotoBoard;
import kosta.exam.exception.DuplicateException;
import kosta.exam.exception.InexistentException;

public class BoardServiceImpl implements BoardService {
	Map<String, Map<String, Board>> allBoardList = new HashMap<String, Map<String, Board>>();
	private static BoardServiceImpl instance = new BoardServiceImpl();
	
	private BoardServiceImpl() {
		
		Map<String, Board> amap = new HashMap<String, Board>();
		Map<String, Board> pmap = new HashMap<String, Board>();
		
		//archive 파일 로딩해서 객체로 만들고 Map에 넣기
		ResourceBundle rb = ResourceBundle.getBundle("kosta/exam/service/archiveInfo");
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			String v [] = value.split(",");
			ArchiveBoard board = new ArchiveBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5], Integer.parseInt(v[6]));
			amap.put(key, board);
		}
		//photo로딩해서 객체로 만들고 Map에 넣기
		rb = ResourceBundle.getBundle("kosta/exam/service/photoInfo");
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			String v [] = value.split(",");
			PhotoBoard board = new PhotoBoard(Integer.parseInt(v[0]), v[1], v[2], v[3], v[4], v[5]);
			pmap.put(key, board);
		}
		//위 각각의 Map을 allBoard
		allBoardList.put("archive", amap);
		allBoardList.put("photo", pmap);
	}
	
	public static BoardServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public Map<String, Map<String, Board>> getBoardList() {
		return allBoardList;
	}

	@Override
	public Map<String, Board> getBoardByKind(String kind) {
		Map<String, Board> map = allBoardList.get(kind);
		if(map == null) {
			throw new InexistentException();
		}
		return map;
	}

	@Override
	public Board getBoardByNo(String kind, int no) {
		Map<String, Board> map = allBoardList.get(kind);
		if(map == null) throw new InexistentException(kind);
		Board board = map.get(Integer.toString(no));
		if(board == null) throw new InexistentException(Integer.toString(no));
		return board;
	}

	@Override
	public boolean insertBoard(String kind, Board board) {
		if(!duplicateByNo(kind, board.getNo())) {
			Map<String, Board> map = new HashMap<String, Board>();
			map.put(Integer.toString(board.getNo()), board);
			allBoardList.get(kind).put(Integer.toString(board.getNo()), board);
			return true;
		} else {
			throw new DuplicateException();
		}
	}

	@Override
	public boolean duplicateByNo(String kind, int no) {
		Map<String, Board> map = allBoardList.get(kind);
		if(map == null) throw new InexistentException();
		Board board = map.get(Integer.toString(no));
		if(board == null) return false;
		return true;
	}

	@Override
	public boolean deleteBoard(String kind, int no) {
		if(duplicateByNo(kind, no)) {
			allBoardList.get(kind).remove(Integer.toString(no));
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBoard(Board board, String kind) {
		if(duplicateByNo(kind, board.getNo())) {
			allBoardList.get(kind).put(Integer.toString(board.getNo()), board);
			return true;
		}
		return false;
	}
}

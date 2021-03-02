package kosta.exam.view;

import java.util.Map;

import kosta.exam.dto.Board;

public class SuccessView {
	public SuccessView() {}
	public static void printBoard(Map<String, Map<String, Board>> map) {
		for(Map.Entry<String, Map<String, Board>> keyMap : map.entrySet()) {
			String k = keyMap.getKey();
			System.out.println("====" + k + "의 모든 게시물 ====");
			Map<String, Board> v = keyMap.getValue();
			for(Map.Entry<String, Board> valueMap : v.entrySet()) {
				String key = valueMap.getKey();
				Board value = valueMap.getValue();
				System.out.println("key = " +  key + " [ " + value + " ] ");
			}
		}
	}
	
	public static void printBoardByKind(String kind, Map<String, Board> map) {
		System.out.println("==== " + kind + "유형 게시물 List ====");
		for(Map.Entry<String, Board> printMap : map.entrySet()) {
			String key = printMap.getKey();
			Board value = printMap.getValue();
			System.out.println("번호 : " + key + ", " + value);
		}
	}
	
	public static void printBoardByNo(Board board) {
		System.out.println(board);
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}

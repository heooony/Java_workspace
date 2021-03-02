package kosta.exam.view;

import kosta.exam.controller.BoardController;
import kosta.exam.dto.ArchiveBoard;
import kosta.exam.dto.PhotoBoard;

public class MainView {

	public static void main(String[] args) {
		//1.archive와 photo 모든 게시물 검색
		System.out.println("1. 모든 게시물 검색");
		BoardController.getAllBoard();
		
		
		System.out.println("\n");
		
		//2. archive 또는 photo  게시판에 있는 모든 게시물 검색
		System.out.println("2. 게시판 유형에 따른 검색");  
		
		System.out.println("2-1.게시판유형이 존재하는 경우.....");
		BoardController.getBoardByKind("archive");
		
		BoardController.getBoardByKind("photo");
		
		System.out.println("2-2.게시판유형이 없는 경우.....");
		BoardController.getBoardByKind("test");
		
		
		System.out.println("\n");
		
		/*3.글번호에 해당하는 자료실검색
		 존재하는 게시물 검색할 경우와 없는 게시물 검색 각각 test 결과 출력하기*/
		 
		System.out.println("3.Board에서 글번호에 해당하는 게시물 검색");
		System.out.println("-----게시물이 존재하는 경우 검색 test----- ");
		BoardController.getBoardByNo("archive", 10); //존재하는 게시물
		
		System.out.println();
		
		System.out.println("-----게시물이 없는 경우(글번호 오류)  검색 test-----");
		BoardController.getBoardByNo("archive", 50);// 없는 게시물
		
         System.out.println();
		
		System.out.println("-----게시물이 없는 경우(kind오류)  검색 test-----");
		BoardController.getBoardByNo("test", 10);// 없는 게시물
		
		System.out.println("\n");
		
		
		//4. 등록하기
		System.out.println("--4-1. 등록하기(성공!!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(40, "mvc공부", "장희정111", "재미있다.", "2018-08-18", "a.jpg"));
		
		System.out.println("--4-2. 등록하기(실패!! - 글번호 중복!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(10, "mvc공부", "장희정", "재미있다.", "2018-08-18", "a.jpg"));
		
		System.out.println("--4-2. 등록하기(실패!! - kind 잘못!!!!)");
		BoardController.insertBoard("photo2" ,
				new PhotoBoard(50, "mvc공부", "장희정", "재미있다.", "2018-08-18", "a.jpg"));
		
		
		System.out.println("---검색하기 --------");
		BoardController.getAllBoard();
		
		System.out.println("--5. 삭제하기..............");
		System.out.println("---5-1. 삭제성공하기-----------------");
        BoardController.deleteBoard("photo", 20);
        
        
        System.out.println("---5-2. 삭제실패하기(kind 오류) -----------------");
        BoardController.deleteBoard("test", 20);
        
        
        System.out.println("---5-3. 삭제실패하기(글번호 오류) -----------------");
        BoardController.deleteBoard("photo", 70);
        
        System.out.println("---검색하기 --------");
		BoardController.getAllBoard();
		
		System.out.println("---6.수정하기----------------");
		System.out.println("--6-1. photo수정 완료-----------------");
		BoardController.updateBoard(new PhotoBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "test.gif") , "photo");
		
		System.out.println("--6-2. archive수정 완료-----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "archive");
		
		//게시판유형 잘못
		System.out.println("--6-3. 수정실패(kind 잘못) -----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "test");
	
		System.out.println("--6-3. 수정실패(no 잘못) -----------------");
		BoardController.updateBoard(new ArchiveBoard(80, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "archive");
	
		 
        System.out.println("---검색하기 --------");
		BoardController.getAllBoard();
	}
}






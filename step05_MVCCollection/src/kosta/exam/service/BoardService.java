package kosta.exam.service;
/**
 * 모든 게시판이 공통으로 사용하게 될 Service
 * (Business Logic)
 * */

import java.util.Map;
import kosta.exam.dto.Board;
import kosta.exam.exception.DuplicateException;
import kosta.exam.exception.InexistentException;

public interface BoardService {
   /**
    *   모든 게시물 검색
    *   @return : 게시판 유형에 따른 모든 게시물 정보를 Map의 형태로 리턴
    *   @throws : 게시물이 한개도 존재 하지 않는다면 InexistentException 예외가
    *             발생한다.
    * */
	Map<String, Map<String, Board>> getBoardList()throws InexistentException;
	
	/**
	 *게시판의유형(Kind)에 따른 게시물 검색하기
	 *  @return kind에 해당하는 전체게시물 Map으로 리턴
	 *  @param :  게시물유형에 따른 key를 인수로 전달받는다.
	 *  @throws : kind에 해당하는 게시물이 한개도 없을 때 InexistentException예외발생
	 * */
	Map<String, Board> getBoardByKind(String kind)throws InexistentException;
	
	/**
	 *  게시물 유형에서 글번호에 해당하는 게시물 한개를 검색
	 * @return 게시물 정보 한개를 Board 형태로 리턴
	 * @param kind는 게시물 유형, no는 게시물 글번호
	 * @throws 검색하는 게시물이 없으면 InexistentException 예외발생
	 * */
	Board getBoardByNo(String kind, int no)throws InexistentException;
	
	/**
	 *  게시물 등록하기
	 *  @return : true이면  등록성공, false이면 등록실패
	 *  @param : kind는 추가할 게시판유형, board는 추가할 게시물의 정보
	 *  @throws: 등록하기 전에 글번호 중복을 체크해서 중복이면 DuplicateException발생
	 *           등록을 실패하면  InexistentException 발생
	 * */
	boolean insertBoard(String kind, Board board)throws DuplicateException, InexistentException;

   /**
    * 5. 등록전에 번호 중복여부 체크 하는 기능
    *    @return : true이면 중복, false이면 중복아님.
    *    @param : kind의 게시판의 유형, no는 글번호
    * */
	boolean duplicateByNo(String kind, int no);
	
	/**
	 * 6. 게시물 삭제하기
	 *  @return : true이면 삭제성공, false이면 삭제실패
	 *  @param : kind의 게시판의 유형, no는 글번호
	 *  @throws : 삭제가 되지 않으면 InexistentException 예외 발생.
	 * */
	boolean deleteBoard(String kind, int no)throws InexistentException;
	
	/**
	 * 7. 게시물 수정하기
	 *     공통 : 제목, 작성자, 내용
	 *     photo : imgName
	 *     archive : fileName, fileSize
	 *     
	 * @param : board는 수정할 게시물의 정보, kind는 수정될 게시물이있는 게시판의유형
	 * @throws: 수정되지 않으면 InexistentException 예외발생
	 * */
	boolean updateBoard(Board board, String kind)throws InexistentException;
}
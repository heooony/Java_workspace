package kosta.exam.service;
/**
 * ��� �Խ����� �������� ����ϰ� �� Service
 * (Business Logic)
 * */

import java.util.Map;
import kosta.exam.dto.Board;
import kosta.exam.exception.DuplicateException;
import kosta.exam.exception.InexistentException;

public interface BoardService {
   /**
    *   ��� �Խù� �˻�
    *   @return : �Խ��� ������ ���� ��� �Խù� ������ Map�� ���·� ����
    *   @throws : �Խù��� �Ѱ��� ���� ���� �ʴ´ٸ� InexistentException ���ܰ�
    *             �߻��Ѵ�.
    * */
	Map<String, Map<String, Board>> getBoardList()throws InexistentException;
	
	/**
	 *�Խ���������(Kind)�� ���� �Խù� �˻��ϱ�
	 *  @return kind�� �ش��ϴ� ��ü�Խù� Map���� ����
	 *  @param :  �Խù������� ���� key�� �μ��� ���޹޴´�.
	 *  @throws : kind�� �ش��ϴ� �Խù��� �Ѱ��� ���� �� InexistentException���ܹ߻�
	 * */
	Map<String, Board> getBoardByKind(String kind)throws InexistentException;
	
	/**
	 *  �Խù� �������� �۹�ȣ�� �ش��ϴ� �Խù� �Ѱ��� �˻�
	 * @return �Խù� ���� �Ѱ��� Board ���·� ����
	 * @param kind�� �Խù� ����, no�� �Խù� �۹�ȣ
	 * @throws �˻��ϴ� �Խù��� ������ InexistentException ���ܹ߻�
	 * */
	Board getBoardByNo(String kind, int no)throws InexistentException;
	
	/**
	 *  �Խù� ����ϱ�
	 *  @return : true�̸�  ��ϼ���, false�̸� ��Ͻ���
	 *  @param : kind�� �߰��� �Խ�������, board�� �߰��� �Խù��� ����
	 *  @throws: ����ϱ� ���� �۹�ȣ �ߺ��� üũ�ؼ� �ߺ��̸� DuplicateException�߻�
	 *           ����� �����ϸ�  InexistentException �߻�
	 * */
	boolean insertBoard(String kind, Board board)throws DuplicateException, InexistentException;

   /**
    * 5. ������� ��ȣ �ߺ����� üũ �ϴ� ���
    *    @return : true�̸� �ߺ�, false�̸� �ߺ��ƴ�.
    *    @param : kind�� �Խ����� ����, no�� �۹�ȣ
    * */
	boolean duplicateByNo(String kind, int no);
	
	/**
	 * 6. �Խù� �����ϱ�
	 *  @return : true�̸� ��������, false�̸� ��������
	 *  @param : kind�� �Խ����� ����, no�� �۹�ȣ
	 *  @throws : ������ ���� ������ InexistentException ���� �߻�.
	 * */
	boolean deleteBoard(String kind, int no)throws InexistentException;
	
	/**
	 * 7. �Խù� �����ϱ�
	 *     ���� : ����, �ۼ���, ����
	 *     photo : imgName
	 *     archive : fileName, fileSize
	 *     
	 * @param : board�� ������ �Խù��� ����, kind�� ������ �Խù����ִ� �Խ���������
	 * @throws: �������� ������ InexistentException ���ܹ߻�
	 * */
	boolean updateBoard(Board board, String kind)throws InexistentException;
}
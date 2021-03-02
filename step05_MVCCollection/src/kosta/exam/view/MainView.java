package kosta.exam.view;

import kosta.exam.controller.BoardController;
import kosta.exam.dto.ArchiveBoard;
import kosta.exam.dto.PhotoBoard;

public class MainView {

	public static void main(String[] args) {
		//1.archive�� photo ��� �Խù� �˻�
		System.out.println("1. ��� �Խù� �˻�");
		BoardController.getAllBoard();
		
		
		System.out.println("\n");
		
		//2. archive �Ǵ� photo  �Խ��ǿ� �ִ� ��� �Խù� �˻�
		System.out.println("2. �Խ��� ������ ���� �˻�");  
		
		System.out.println("2-1.�Խ��������� �����ϴ� ���.....");
		BoardController.getBoardByKind("archive");
		
		BoardController.getBoardByKind("photo");
		
		System.out.println("2-2.�Խ��������� ���� ���.....");
		BoardController.getBoardByKind("test");
		
		
		System.out.println("\n");
		
		/*3.�۹�ȣ�� �ش��ϴ� �ڷ�ǰ˻�
		 �����ϴ� �Խù� �˻��� ���� ���� �Խù� �˻� ���� test ��� ����ϱ�*/
		 
		System.out.println("3.Board���� �۹�ȣ�� �ش��ϴ� �Խù� �˻�");
		System.out.println("-----�Խù��� �����ϴ� ��� �˻� test----- ");
		BoardController.getBoardByNo("archive", 10); //�����ϴ� �Խù�
		
		System.out.println();
		
		System.out.println("-----�Խù��� ���� ���(�۹�ȣ ����)  �˻� test-----");
		BoardController.getBoardByNo("archive", 50);// ���� �Խù�
		
         System.out.println();
		
		System.out.println("-----�Խù��� ���� ���(kind����)  �˻� test-----");
		BoardController.getBoardByNo("test", 10);// ���� �Խù�
		
		System.out.println("\n");
		
		
		//4. ����ϱ�
		System.out.println("--4-1. ����ϱ�(����!!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(40, "mvc����", "������111", "����ִ�.", "2018-08-18", "a.jpg"));
		
		System.out.println("--4-2. ����ϱ�(����!! - �۹�ȣ �ߺ�!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(10, "mvc����", "������", "����ִ�.", "2018-08-18", "a.jpg"));
		
		System.out.println("--4-2. ����ϱ�(����!! - kind �߸�!!!!)");
		BoardController.insertBoard("photo2" ,
				new PhotoBoard(50, "mvc����", "������", "����ִ�.", "2018-08-18", "a.jpg"));
		
		
		System.out.println("---�˻��ϱ� --------");
		BoardController.getAllBoard();
		
		System.out.println("--5. �����ϱ�..............");
		System.out.println("---5-1. ���������ϱ�-----------------");
        BoardController.deleteBoard("photo", 20);
        
        
        System.out.println("---5-2. ���������ϱ�(kind ����) -----------------");
        BoardController.deleteBoard("test", 20);
        
        
        System.out.println("---5-3. ���������ϱ�(�۹�ȣ ����) -----------------");
        BoardController.deleteBoard("photo", 70);
        
        System.out.println("---�˻��ϱ� --------");
		BoardController.getAllBoard();
		
		System.out.println("---6.�����ϱ�----------------");
		System.out.println("--6-1. photo���� �Ϸ�-----------------");
		BoardController.updateBoard(new PhotoBoard(10, "���ɽð�", "��ȿ��", "�� ����??", null, "test.gif") , "photo");
		
		System.out.println("--6-2. archive���� �Ϸ�-----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "���ɽð�", "��ȿ��", "�� ����??", null, "a.xls",300) , "archive");
		
		//�Խ������� �߸�
		System.out.println("--6-3. ��������(kind �߸�) -----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "���ɽð�", "��ȿ��", "�� ����??", null, "a.xls",300) , "test");
	
		System.out.println("--6-3. ��������(no �߸�) -----------------");
		BoardController.updateBoard(new ArchiveBoard(80, "���ɽð�", "��ȿ��", "�� ����??", null, "a.xls",300) , "archive");
	
		 
        System.out.println("---�˻��ϱ� --------");
		BoardController.getAllBoard();
	}
}






package kosta.exam.dto;

public class ArchiveBoard extends Board{
	private String fileName;
	private int fileSize;
	
	public ArchiveBoard() { }
	public ArchiveBoard(int no, String subject, String writer, String content, String date, String fileName, int fileSize) {
		super(no, subject, writer, content, date);
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public String toString() {
		return super.toString() + ", ÷������ �̸� : " + fileName + ", ���� �뷮 : " + fileSize;
	}
}

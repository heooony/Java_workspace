package kosta.exam.dto;

public class PhotoBoard extends Board{
	private String imgName;
	Object obj;
	
	public PhotoBoard() { }
	public PhotoBoard(int no, String subject, String writer, String content, String date, String imgName) {
		super(no, subject, writer, content, date);
		this.imgName = imgName;
	}
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 이미지 이름 : " + imgName;
	}
}

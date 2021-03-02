package board;

/**
 * 
 * 게시물의 속성을 관리하는 객체
 * 글 번호, 제목, 내용, 작성자 등
 */
public class BoardVo {
	private int no;
	private String subject;
	private String content;
	private String writer;
	
	public BoardVo() {}
	public BoardVo(int no, String subject, String content, String writer) {
		super();
		this.no = no;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public int getNo() {return no;}
	public void setNo(int no) {this.no = no;}
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardVo [no=");
		builder.append(no);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append("]");
		return builder.toString();
	}
	
}

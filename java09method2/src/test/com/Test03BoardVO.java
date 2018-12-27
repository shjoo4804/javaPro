package test.com;

import java.util.Date;

public class Test03BoardVO {

	private String title;
	private String content;
	private String writer;
	private Date wDate;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWDate() {
		this.wDate = new Date();
		return wDate;
	}

	
}

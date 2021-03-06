package kr.green.spring.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	private int num;
	private String title;
	private String contents;
	private String writer;
	private Date registered;
	private String file;
	private int views;
	private String valid;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegistered() { 
		//날자와 시간을 원하는 형식으로 보이게 하기위한 방법
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return f.format(registered);
	}
	public void setRegistered(Date registered) {
		this.registered = registered;
	}
	public void setRegistered(String registered) {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.registered = transFormat.parse(registered);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	public String getFile() {
		return file;
	}
	public String getFileName() {
		//UUID가 제거되도록 코드작성
		//4d781699-bc2c-4f4e-aa2a-9ebb87ff9d3e_2.jpg => 2.jpg가 되도록
		if(file ==null) {
			return "";
		}
		int index = file.indexOf("_");
		return file.substring(index+1);
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", registered=" + registered + ", file=" + file + ", views=" + views + ", valid=" + valid + "]";
	}
	
	
	
}


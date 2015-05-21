package org.gr.pm.po;

import java.sql.Date;

public class notice {
	private int id;
	private int teamid;
	private int author;
	private String content;
	private Date time;
	
	
	public notice(int id, int teamid, int author, String content, Date time) {
		super();
		this.id = id;
		this.teamid = teamid;
		this.author = author;
		this.content = content;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "notice [id=" + id + ", teamid=" + teamid + ", author=" + author
				+ ", content=" + content + ", time=" + time + "]";
	}
	
	

}

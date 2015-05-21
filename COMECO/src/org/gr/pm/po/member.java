package org.gr.pm.po;

public class member {
	private int id;
	private int teamid;
	private int userid;
	public member(int id, int teamid, int userid) {
		super();
		this.id = id;
		this.teamid = teamid;
		this.userid = userid;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "member [id=" + id + ", teamid=" + teamid + ", userid=" + userid
				+ "]";
	}
	
}

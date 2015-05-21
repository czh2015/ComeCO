package org.gr.pm.po;

public class teamType {
	private int id,teamid,typeid;

	public teamType(int id, int teamid, int typeid) {
		super();
		this.id = id;
		this.teamid = teamid;
		this.typeid = typeid;
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

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	@Override
	public String toString() {
		return "teamType [id=" + id + ", teamid=" + teamid + ", typeid="
				+ typeid + "]";
	}
	
}

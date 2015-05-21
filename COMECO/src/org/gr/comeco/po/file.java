package org.gr.pm.po;

public class file {
	private int id;
	private int teamid;
	private String file;
	public file(int id, int teamid, String file) {
		super();
		this.id = id;
		this.teamid = teamid;
		this.file = file;
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

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "file [id=" + id + ", teamid=" + teamid + ", file=" + file + "]";
	}
	
}

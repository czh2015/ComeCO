package org.gr.pm.po;

public class userAdv {
	private int id,userid,advid;

	public userAdv(int id, int userid, int advid) {
		super();
		this.id = id;
		this.userid = userid;
		this.advid = advid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAdvid() {
		return advid;
	}

	public void setAdvid(int advid) {
		this.advid = advid;
	}

	@Override
	public String toString() {
		return "userAdv [id=" + id + ", userid=" + userid + ", advid=" + advid
				+ "]";
	}
	
	

}

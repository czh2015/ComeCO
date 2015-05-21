package org.gr.pm.po;

public class attention {
	private int id;
	private int u1;
	private int u2;
	
	public attention(int id, int u1, int u2) {
		super();
		this.id = id;
		this.u1 = u1;
		this.u2 = u2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getU1() {
		return u1;
	}

	public void setU1(int u1) {
		this.u1 = u1;
	}

	public int getU2() {
		return u2;
	}

	public void setU2(int u2) {
		this.u2 = u2;
	}

	@Override
	public String toString() {
		return "attention [id=" + id + ", u1=" + u1 + ", u2=" + u2 + "]";
	}
	

}

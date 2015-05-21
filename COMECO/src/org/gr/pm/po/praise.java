package org.gr.pm.po;

public class praise {
	private int id,give,accept;

	public praise(int id, int give, int accept) {
		super();
		this.id = id;
		this.give = give;
		this.accept = accept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGive() {
		return give;
	}

	public void setGive(int give) {
		this.give = give;
	}

	public int getAccept() {
		return accept;
	}

	public void setAccept(int accept) {
		this.accept = accept;
	}

	@Override
	public String toString() {
		return "praise [id=" + id + ", give=" + give + ", accept=" + accept
				+ "]";
	}
	
}

package org.gr.pm.po;

public class type {
	private int id;
	private String name;
	public type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "type [id=" + id + ", name=" + name + "]";
	}
	

}

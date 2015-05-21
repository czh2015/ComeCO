package org.gr.pm.po;

import java.sql.Date;

public class team {
	private int id;
	private String name;
	private int max_mem;
	private int leader_id;
	private String image;
	private Date start_time,end_time;
	
	
	public team(int id, String name, int max_mem, int leader_id, String image,
			Date start_time, Date end_time) {
		super();
		this.id = id;
		this.name = name;
		this.max_mem = max_mem;
		this.leader_id = leader_id;
		this.image = image;
		this.start_time = start_time;
		this.end_time = end_time;
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
	public int getMax_mem() {
		return max_mem;
	}
	public void setMax_mem(int max_mem) {
		this.max_mem = max_mem;
	}
	public int getLeader_id() {
		return leader_id;
	}
	public void setLeader_id(int leader_id) {
		this.leader_id = leader_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "team [id=" + id + ", name=" + name + ", max_mem=" + max_mem
				+ ", leader_id=" + leader_id + ", image=" + image
				+ ", start_time=" + start_time + ", end_time=" + end_time + "]";
	}
	
	

}

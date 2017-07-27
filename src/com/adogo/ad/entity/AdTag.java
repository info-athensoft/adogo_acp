package com.adogo.ad.entity;

public class AdTag {
	
	private long tag_id;
	private String tag_name;
	private int tag_score;
	
	public long getTag_id() {
		return tag_id;
	}
	
	public void setTag_id(long tag_id) {
		this.tag_id = tag_id;
	}
	
	public String getTag_name() {
		return tag_name;
	}
	
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	
	public int getTag_score() {
		return tag_score;
	}
	
	public void setTag_score(int tag_score) {
		this.tag_score = tag_score;
	}
	
	@Override
	public String toString() {
		return "AdTag [tag_id=" + tag_id + ", tag_name=" + tag_name + ", tag_score=" + tag_score + "]";
	}
	
	

}

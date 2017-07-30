package com.adogo.ad.entity;

public class AdTag {
	
	private long tagId;			//tagId
	private String tagName;		//tagName
	private int tagScore;		//tagScore
	public long getTagId() {
		return tagId;
	}
	public void setTagId(long tagId) {
		this.tagId = tagId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public int getTagScore() {
		return tagScore;
	}
	public void setTagScore(int tagScore) {
		this.tagScore = tagScore;
	}
	@Override
	public String toString() {
		return "AdTag [tagId=" + tagId + ", tagName=" + tagName + ", tagScore=" + tagScore + "]";
	}
	
	
	
	

}

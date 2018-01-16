package com.adogo.advertiser.entity.adpost;

public class AdTag {
	
	private Long tagId;			//tagId
	private String tagName;		//tagName
	private Integer tagScore;		//tagScore
	
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public Integer getTagScore() {
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

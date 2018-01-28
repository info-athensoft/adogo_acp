package com.adogo.support.entity;

/**
 * Post of support topic
 * applied at Support system, FAQ's, etc.
 * 
 * @author sfz
 *
 */
public class Support {
	private Long globalId;
	private Long topicId;
	private Integer langNo;
	private String topicTitle;
	private String topicContent;
	
	/**
	 * view number of this support post
	 */
	private Integer viewNum;
	private Integer topicStatus;
	
	public Long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(Long globalId) {
		this.globalId = globalId;
	}
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	public String getTopicContent() {
		return topicContent;
	}
	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}
	public Integer getViewNum() {
		return viewNum;
	}
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}
	public Integer getTopicStatus() {
		return topicStatus;
	}
	public void setTopicStatus(Integer topicStatus) {
		this.topicStatus = topicStatus;
	}
	
	@Override
	public String toString() {
		return "Support [globalId=" + globalId + ", topicId=" + topicId + ", langNo=" + langNo + ", topicTitle="
				+ topicTitle + ", topicContent=" + topicContent + ", viewNum=" + viewNum + ", topicStatus="
				+ topicStatus + "]";
	}
}

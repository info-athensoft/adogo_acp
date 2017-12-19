package test.entity;

import java.sql.Blob;

public class TestEditorSfz {
	private Integer id;
	private String ltext;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLtext() {
		return ltext;
	}
	public void setLtext(String ltext) {
		this.ltext = ltext;
	}
	public Blob getBtext() {
		return btext;
	}
	public void setBtext(Blob btext) {
		this.btext = btext;
	}
	private Blob btext;
}

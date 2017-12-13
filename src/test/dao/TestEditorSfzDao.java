package test.dao;

import java.sql.Blob;

import test.entity.TestEditorSfz;

public interface TestEditorSfzDao {
	
	public TestEditorSfz findById(int id);
	
	public int update(int id, String ltext);
	public int update(int id,Blob btext);
	public int update(int id, String ltext, Blob btext);

}

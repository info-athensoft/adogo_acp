package com.adogo.admin.dao;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.admin.entity.TestEditorSfz;

@Component
@Qualifier("testEditorSfzDaoJdbcImpl")
public class TestEditorSfzDaoJdbcImpl implements TestEditorSfzDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public int update(int id, String ltext, Blob btext) {
		final String TABLE1 = "test_editor_sfz";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("update "+TABLE1);
		sbf.append(" set ltext=:ltext,btext=:btext ");
		sbf.append("where 1=1 ");
		sbf.append("and id=:id");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", id);
		paramSource.addValue("ltext", ltext);
		paramSource.addValue("btext", btext);
		
		jdbc.update(sql, paramSource);
//		KeyHolder keyholder = new GeneratedKeyHolder();
//		jdbc.update(sql, paramSource, keyholder);
//		return (int) keyholder.getKey();
		return 0;
	}

	@Override
	public int update(int id, String ltext) {
		final String TABLE1 = "test_editor_sfz";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("update "+TABLE1);
		sbf.append(" set ltext=:ltext ");
		sbf.append("where 1=1 ");
		sbf.append("and id=:id");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", id);
		paramSource.addValue("ltext", ltext);
		
//		KeyHolder keyholder = new GeneratedKeyHolder();
//		jdbc.update(sql, paramSource, keyholder);
//		return (int) keyholder.getKey();
		
		jdbc.update(sql, paramSource);
		return 0;
	}

	@Override
	public int update(int id, Blob btext) {
		final String TABLE1 = "test_editor_sfz";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("update "+TABLE1);
		sbf.append(" set btext=:btext ");
		sbf.append("where 1=1 ");
		sbf.append("and id=:id");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", id);
		paramSource.addValue("btext", btext);
		
//		KeyHolder keyholder = new GeneratedKeyHolder();
//		jdbc.update(sql, paramSource, keyholder);
//		return (int) keyholder.getKey();
		
		jdbc.update(sql, paramSource);
		return 0;
	}

	@Override
	public TestEditorSfz findById(int id) {
		String sql = "select * from test_editor_sfz where id =:id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", id);
		TestEditorSfz t = null;
		try{
			t = jdbc.queryForObject(sql, paramSource, new TestEditorSfzRowMapper());
		}catch(EmptyResultDataAccessException ex){
			t = null;
		}
		return t;
	}
	
	private static class TestEditorSfzRowMapper implements RowMapper<TestEditorSfz>{
		public TestEditorSfz mapRow(ResultSet rs, int rowNumber) throws SQLException {
			TestEditorSfz x = new TestEditorSfz();
			x.setId(rs.getInt("id"));
			x.setLtext(rs.getString("ltext"));
			x.setBtext(rs.getBlob("btext"));
			
            return x;
		}		
	}

}

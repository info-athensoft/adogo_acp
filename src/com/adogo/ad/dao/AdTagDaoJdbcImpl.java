package com.adogo.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.adpost.old.AdTag;

@Component
@Qualifier("adTagDaoJdbcImpl")
public class AdTagDaoJdbcImpl implements AdTagDao{
	
	private NamedParameterJdbcTemplate jdbc;
	
	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public AdTag findTagByName(String tagName) {
		System.out.println("entering -- AdTagDaoImpl/findTagByName ");
		String sql = "select * from AD_TAG where tag_name =:tagName";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("tagName", tagName);
		AdTag x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new AdTagRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}


	@Override
	public int persistTag(String tagName) {
		//System.out.println("entering -- AdTagDaoImpl/updateTag ");
		AdTag tag = this.findTagByName(tagName);
		if (tag == null) {
			return (int) this.create(tagName);
		}
		else {
			return this.updateTagScore(tagName);
		}
	}
	
	private long create(String tagName) {
		//System.out.println("entering -- AdTagDaoImpl/create ");
		final String TABLE = "AD_TAG";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(tag_name,tag_score) ");
		sbf.append("values(:tag_name,:tag_score)");
		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("tag_name", tagName);
		paramSource.addValue("tag_score", 1);		
		
		//KeyHolder keyholder = new GeneratedKeyHolder();
		//jdbc.update(sql, paramSource, keyholder);
		//return (long)keyholder.getKey();
		return jdbc.update(sql, paramSource);
	}

	private int updateTagScore(String tagName) {
		//System.out.println("entering -- AdTagDaoImpl/updateTagScore ");
		String sql = "UPDATE AD_TAG "
	               + "SET tag_score = (tag_score+1) "
				   + "WHERE 1=1 "
				   + "AND tag_name = :tagName";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("tagName", tagName);
		return jdbc.update(sql,paramSource);
		
	}
	
	private static class AdTagRowMapper implements RowMapper<AdTag>{
		public AdTag mapRow(ResultSet rs, int rowNumber) throws SQLException {
			
			AdTag x = new AdTag();
			x.setTagId(rs.getLong("tag_id"));
			x.setTagName(rs.getString("tag_name"));
			x.setTagScore(rs.getInt("tag_score"));
			
            return x;
		}		
	}
	
}

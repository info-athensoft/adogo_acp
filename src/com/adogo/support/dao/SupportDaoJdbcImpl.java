package com.adogo.support.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.adogo.support.entity.Support;

/**
 * @author fz
 *
 */

@Component
@Qualifier("supportDaoJdbcImpl")
public class SupportDaoJdbcImpl implements SupportDao {
	
private NamedParameterJdbcTemplate jdbc;
private final String TABLE = "SUPPORT";
private static final Logger logger = Logger.getLogger(SupportDaoJdbcImpl.class);
	
/**
 * inject DataSource object
 * @param dataSource
 */
@Autowired
public void setDataSource(DataSource dataSource){
	this.jdbc = new NamedParameterJdbcTemplate(dataSource);
}

@Override
public Support findSupportById(long supportId) {
	StringBuffer sbf = new StringBuffer();
	sbf.append("SELECT ");
	sbf.append("global_id, ");
	sbf.append("topic_id, ");
	sbf.append("lang_no, ");
	sbf.append("topic_title, ");
	sbf.append("topic_content, ");
	sbf.append("view_num, ");
	sbf.append("topic_status ");
	sbf.append(" FROM "+TABLE);
	sbf.append(" WHERE 1 = 1");
	sbf.append(" AND global_id =:global_id ");
	String sql = sbf.toString();
	
	MapSqlParameterSource paramSource = new MapSqlParameterSource();
	
	paramSource.addValue("global_id", supportId);
	Support x = null;
	try{
		x = jdbc.queryForObject(sql,paramSource,new SupportRowMapper());
	}catch(EmptyResultDataAccessException ex){
		x = null;
	}
	return x;
}
/*
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
*/
public int create(Support x) {
	//System.out.println("entering -- AdTagDaoImpl/create ");
	
	StringBuffer sbf = new StringBuffer();
	sbf.append("INSERT INTO ").append(TABLE).append("(");
	sbf.append("topic_id, ");
	sbf.append("lang_no, ");
	sbf.append("topic_title, ");
	sbf.append("topic_content, ");
	sbf.append("view_num, ");
	sbf.append("topic_status) ");
	
	sbf.append("VALUES(");
	sbf.append(":topic_id,");
	sbf.append(":lang_no,");
	sbf.append(":topic_title,");
	sbf.append(":topic_content,");
	sbf.append(":view_num,");
	sbf.append(":topic_status) ");
	
	String sql = sbf.toString();
	logger.info(sql);
	
	MapSqlParameterSource paramSource = new MapSqlParameterSource();
	paramSource.addValue("topic_id", x.getTopicId());
	paramSource.addValue("lang_no", x.getLangNo());
	paramSource.addValue("topic_title", x.getTopicTitle());
	paramSource.addValue("topic_content", x.getTopicContent());
	paramSource.addValue("view_num", x.getViewNum());
	paramSource.addValue("topic_status", x.getTopicStatus());

	
	return jdbc.update(sql,paramSource);
}

@Override
public List<Support> getSupports() {
	StringBuffer sbf = new StringBuffer();
	sbf.append("SELECT ");
	sbf.append("global_id, ");
	sbf.append("topic_id, ");
	sbf.append("lang_no, ");
	sbf.append("topic_title, ");
	sbf.append("topic_content, ");
	sbf.append("view_num, ");
	sbf.append("topic_status ");
	sbf.append(" FROM "+TABLE);
	sbf.append(" WHERE 1 = 1");
	String sql = sbf.toString();
	
	MapSqlParameterSource paramSource = new MapSqlParameterSource();
	List<Support> x = new ArrayList<Support>();
	try{
		x = jdbc.query(sql, paramSource, new SupportRowMapper());
	}catch(EmptyResultDataAccessException ex){
		x = null;
	}
	return x;
}

private static class SupportRowMapper implements RowMapper<Support>{
	public Support mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Support x = new Support();
		x.setGlobalId(rs.getLong("global_id"));
		x.setTopicId(rs.getLong("topic_id"));
		x.setLangNo(rs.getInt("lang_no"));
		x.setTopicTitle(rs.getString("topic_title"));
		x.setTopicContent(rs.getString("topic_content"));
		x.setViewNum(rs.getInt("view_num"));
		x.setTopicStatus(rs.getString("topic_status"));
        return x;
	}		
}




/*
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
*/
}

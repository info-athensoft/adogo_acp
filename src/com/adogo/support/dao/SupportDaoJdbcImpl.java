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
import org.springframework.stereotype.Repository;

import com.adogo.support.entity.Support;

/**
 * @author sfz
 *
 */

@Repository
@Qualifier("supportDaoJdbcImpl")
public class SupportDaoJdbcImpl implements SupportDao {

	private static final Logger logger = Logger.getLogger(SupportDaoJdbcImpl.class);

	private final String TABLE = "SUPPORT";

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Support> findAll() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("topic_id, ");
		sbf.append("lang_no, ");
		sbf.append("topic_title, ");
		sbf.append("topic_content, ");
		sbf.append("view_num, ");
		sbf.append("topic_status ");
		sbf.append(" FROM ").append(TABLE);
		sbf.append(" WHERE 1 = 1");
		String sql = sbf.toString();
	
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<Support> x = new ArrayList<Support>();
		try {
			x = jdbc.query(sql, paramSource, new SupportRowMapper());
		} catch (EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public Support findById(long globalId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("topic_id, ");
		sbf.append("lang_no, ");
		sbf.append("topic_title, ");
		sbf.append("topic_content, ");
		sbf.append("view_num, ");
		sbf.append("topic_status ");
		sbf.append(" FROM ").append(TABLE);
		sbf.append(" WHERE 1 = 1");
		sbf.append(" AND global_id =:global_id ");
		
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("global_id", globalId);
		Support x = null;
		try {
			x = jdbc.queryForObject(sql, paramSource, new SupportRowMapper());
		} catch (EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public int create(Support x) {
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

		return jdbc.update(sql, paramSource);
	}

	@Override
	public int update(Support x) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("UPDATE ").append(TABLE).append(" SET ");
		sbf.append("lang_no=:lang_no,");
		sbf.append("topic_title=:topic_title,");
		sbf.append("topic_content=:topic_content,");
		sbf.append("topic_status=:topic_status");
	
		sbf.append(" WHERE 1=1");
		sbf.append(" AND global_id=:global_id");
	
		String sql = sbf.toString();
		logger.info(sql);
	
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("global_id", x.getGlobalId());
		paramSource.addValue("lang_no", x.getLangNo());
		paramSource.addValue("topic_title", x.getTopicTitle());
		paramSource.addValue("topic_content", x.getTopicContent());
		paramSource.addValue("topic_status", x.getTopicStatus());
	
		return jdbc.update(sql, paramSource);
	}

	private static class SupportRowMapper implements RowMapper<Support> {
		public Support mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Support x = new Support();
			x.setGlobalId(rs.getLong("global_id"));
			x.setTopicId(rs.getLong("topic_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setTopicTitle(rs.getString("topic_title"));
			x.setTopicContent(rs.getString("topic_content"));
			x.setViewNum(rs.getInt("view_num"));
			x.setTopicStatus(rs.getInt("topic_status"));
			return x;
		}
	}

}

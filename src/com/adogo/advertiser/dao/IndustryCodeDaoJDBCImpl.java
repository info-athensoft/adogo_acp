package com.adogo.advertiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.IndustryCode;

@Component
@Qualifier("industryCodeDaoJDBCImpl")
public class IndustryCodeDaoJDBCImpl implements IndustryCodeDao {

	private NamedParameterJdbcTemplate jdbc;
	
	private final String TABLE = "INFO_INDUSTRY_NAICS";
	
	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<IndustryCode> findAll() {
		
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("uid, ");
		sbf.append("industry_code, ");
		sbf.append("parent_code, ");
		sbf.append("industry_name, ");
		sbf.append("level_no, ");
		sbf.append("region_tag ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" ORDER BY industry_code");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		return jdbc.query(sql,paramSource,new IndustryCodeRowMapper());
	}

	@Override
	public List<IndustryCode> findByLevelNo(int levelNo) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("uid, ");
		sbf.append("industry_code, ");
		sbf.append("parent_code, ");
		sbf.append("industry_name, ");
		sbf.append("level_no, ");
		sbf.append("region_tag ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE level_no=:level_no");
		sbf.append(" ORDER BY industry_code");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("level_no", levelNo);
		return jdbc.query(sql,paramSource,new IndustryCodeRowMapper());
	}
	
	@Override
	public List<IndustryCode> findByLevelNo(int levelNo, String industryCode) {
		//(str between substring_index(parent_code,'-',1) and substring_index(parent_code,'-',-1))
		String parentIndustryCode = industryCode.substring(0, levelNo);
		System.out.println("levelNo="+levelNo +" parentIndustryCode(str)="+parentIndustryCode);
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("uid, ");
		sbf.append("industry_code, ");
		sbf.append("parent_code, ");
		sbf.append("industry_name, ");
		sbf.append("level_no, ");
		sbf.append("region_tag ");
		sbf.append(" FROM " + TABLE);
		//sbf.append(" WHERE level_no=:level_no and industry_code LIKE ':parentIndustryCode" + "%'");//41
		sbf.append(" WHERE level_no=:level_no and industry_code LIKE '" + parentIndustryCode + "%'");
		sbf.append(" ORDER BY industry_code");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("level_no", levelNo);
		//paramSource.addValue("parentIndustryCode", parentIndustryCode);
		return jdbc.query(sql,paramSource,new IndustryCodeRowMapper());
	}
	
	@Override
	public List<IndustryCode> findLevelSelected(int levelNo, String industryCode) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("uid, ");
		sbf.append("industry_code, ");
		sbf.append("parent_code, ");
		sbf.append("industry_name, ");
		sbf.append("level_no, ");
		sbf.append("region_tag ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE level_no=:level_no and industry_code LIKE ':str%'");
		sbf.append(" ORDER BY industry_code");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("level_no", levelNo);
		paramSource.addValue("str", industryCode.substring(0, levelNo+1));
		return jdbc.query(sql,paramSource,new IndustryCodeRowMapper());
	}

	@Override
	public List<IndustryCode> findByParentCode(String parentCode) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("uid, ");
		sbf.append("industry_code, ");
		sbf.append("parent_code, ");
		sbf.append("industry_name, ");
		sbf.append("level_no, ");
		sbf.append("region_tag ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE parent_code=:parent_code");
		sbf.append(" ORDER BY industry_code");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("parent_code", parentCode);
		return jdbc.query(sql,paramSource,new IndustryCodeRowMapper());
	}

	
	private static class IndustryCodeRowMapper implements RowMapper<IndustryCode>{
		public IndustryCode mapRow(ResultSet rs, int rowNumber) throws SQLException {
			IndustryCode x = new IndustryCode();
			x.setGlobalId(rs.getInt("uid"));
			x.setIndustryCode(rs.getString("industry_code"));
			x.setParentCode(rs.getString("parent_code"));
			x.setIndustryName(rs.getString("industry_name"));
			x.setLevelNo(rs.getInt("level_no"));
			x.setRegionTag(rs.getString("region_tag"));
            return x;
		}		
	}
}

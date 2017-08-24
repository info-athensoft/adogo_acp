package com.adogo.uaas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

//import com.adogo.uaas.dao.UserAccountDaoParamImpl.UserAccountRowMapper;
import com.adogo.uaas.entity.UserAccount;

@Component
@Qualifier("userAccountDaoParamImpl")
public class UserAccountDaoParamImpl implements UserAccountDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<UserAccount> find() {
		String sql = "select * from UAAS_USER_ACCOUNT";		
		return jdbc.query(sql, new UserAccountRowMapper());
	}

	@Override
	public UserAccount findById(long acctId) {
		String sql = "select * from UAAS_USER_ACCOUNT where acct_id =:acctId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("acctId", acctId);
		UserAccount ua = null;
		try{
			ua = jdbc.queryForObject(sql, paramSource, new UserAccountRowMapper());
		}catch(EmptyResultDataAccessException ex){
			ua = null;
		}
		return ua;
	}
	
	@Override
	public UserAccount findByName(String name) {
		String sql = "select * from user_account where acct_name =:name";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("name", name);
		UserAccount ua = null;
		try{
			ua = jdbc.queryForObject(sql, paramSource, new UserAccountRowMapper());
		}catch(EmptyResultDataAccessException ex){
			ua = null;
		}
		return ua;
	}
	
	@Override
	public boolean isUserAccountExist(UserAccount userAccount) {
		String acctName = userAccount.getAcctName();
		UserAccount ua = this.findByName(acctName);
		if (ua == null) {
			return false;
		}
		return true;
	}

	@Override
	public long create(UserAccount userAccount) {
		final String TABLE1 = "UAAS_USER_ACCOUNT";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE1);
		sbf.append("(acct_name,password,primary_email,secure_email,create_date,last_mod_date,acct_status) ");
		sbf.append("values(:acct_name,:password,:primary_email,:secure_email,:create_date,:last_mod_date,:acct_status)");
		String sql = sbf.toString();
		
		final int USER_ACCOUNT_STATUS 	= 0;  //1: registered and active, 0: in-activated, 2: locked, pending     
		final Date dateCreate 			= new Date();
		final Date dateLastModified 	= dateCreate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("acct_name", userAccount.getAcctName());
		paramSource.addValue("password", userAccount.getPassword());
		paramSource.addValue("primary_email",userAccount.getPrimaryEmail());
		paramSource.addValue("secure_email",userAccount.getSecureEmail());
		paramSource.addValue("create_date",new java.sql.Timestamp(dateCreate.getTime()));
		paramSource.addValue("last_mod_date",new java.sql.Timestamp(dateLastModified.getTime()));
		paramSource.addValue("acct_status",USER_ACCOUNT_STATUS);
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
		
		//return jdbc.execute(sql, new UserAccountRowMapper());
	}

	@Override
	public void update(UserAccount userAccount) {						
			final String TABLE1 = "UAAS_USER_ACCOUNT";
			
			StringBuffer sbf = new StringBuffer();
			sbf.append("update "+TABLE1);
			sbf.append(" set acct_name=:acct_name,password=:password,primary_email=:primary_email,secure_email=:secure_email,last_mod_date=:last_mod_date,acct_status=:acct_status ");
			sbf.append("where 1=1 ");
			sbf.append("and acct_id=:acct_id");
			String sql = sbf.toString();
			
			//1: registered and active, 0: in-activated, 2: locked, pending     
//			final Date dateCreate 			= new Date();
			final Date dateLastModified 	= new Date();
			MapSqlParameterSource paramSource = new MapSqlParameterSource();
			paramSource.addValue("acct_name", userAccount.getAcctName());
			paramSource.addValue("password", userAccount.getPassword());
			paramSource.addValue("primary_email",userAccount.getPrimaryEmail());
			paramSource.addValue("secure_email",userAccount.getSecureEmail());
//			paramSource.addValue("create_date",new java.sql.Timestamp(dateCreate.getTime()));
			paramSource.addValue("last_mod_date",new java.sql.Timestamp(dateLastModified.getTime()));
			paramSource.addValue("acct_status",userAccount.getAcctStatus());
			paramSource.addValue("acct_id",userAccount.getAcctId());
			
			jdbc.update(sql, paramSource);

	}

	@Override
	public void delete(long acctId) {
		String sql = "delete from user_account where acct_id =:acctId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("acctId", acctId);
		jdbc.update(sql, paramSource);
	}
	
	@Override
	public UserAccount querySignin(UserAccount userAccount) {
		String sql = "select * from UAAS_USER_ACCOUNT where acct_name =:acct_name and password=:password";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("acct_name", userAccount.getAcctName());
		paramSource.addValue("password", userAccount.getPassword());
		UserAccount ua = null;
		try{
			ua = jdbc.queryForObject(sql, paramSource, new UserAccountRowMapper());
		}catch(EmptyResultDataAccessException ex){
			ua = null;
		}
		return ua;
	}

	@Override
	public void activateAccount(UserAccount userAccount) {
		final String TABLE1 = "UAAS_USER_ACCOUNT";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("update "+TABLE1);
		sbf.append(" set last_mod_date=:last_mod_date,acct_status=:acct_status ");
		sbf.append("where 1=1 ");
		sbf.append("and acct_id=:acct_id");
		String sql = sbf.toString();
		
		//1: registered and active, 0: in-activated, 2: locked, pending     
//		final Date dateCreate 			= new Date();
		final Date dateLastModified 	= new Date();
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("last_mod_date",new java.sql.Timestamp(dateLastModified.getTime()));
		paramSource.addValue("acct_status",userAccount.getAcctStatus());
		paramSource.addValue("acct_id",userAccount.getAcctId());
		
		jdbc.update(sql, paramSource);
		
	}

	private static class UserAccountRowMapper implements RowMapper<UserAccount>{
		public UserAccount mapRow(ResultSet rs, int rowNumber) throws SQLException {
			UserAccount x = new UserAccount();
			x.setAcctId(rs.getLong("acct_id"));
			x.setAcctName(rs.getString("acct_name"));
			x.setPassword(rs.getString("password"));
			x.setPrimaryEmail(rs.getString("primary_email"));
			x.setSecureEmail(rs.getString("secure_email"));
				Timestamp ts = rs.getTimestamp("create_date");			
			x.setCreateDate(new Date(ts.getTime()));
				ts = rs.getTimestamp("last_mod_date");
			x.setLastModDate(new Date(ts.getTime()));
				ts = null;
			x.setAcctStatus(rs.getInt("acct_status"));
            return x;
		}		
	} 

}


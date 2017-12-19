package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.uaas.entity.Role;

import test.entity.TestUserRole;

@Component
@Qualifier("testUserRoleDaoJdbcImpl")
public class TestUserRoleDaoJdbcImpl implements TestUserRoleDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public ArrayList<Integer> getRoleIdListByAcctId(long acctId) {
		String sql = "select * from UAAS_ROLE where acct_id=:acct_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("acct_id", acctId);
		List<TestUserRole> x = new ArrayList<TestUserRole>();
		try{
			x = jdbc.query(sql, paramSource, new TestUserRoleRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		
		ArrayList<Integer> roleIdList = new ArrayList<>();
		for (TestUserRole t : x) {
			roleIdList.add(t.getRoleId());
		}
		
		return roleIdList;
	}
	
	private static class TestUserRoleRowMapper implements RowMapper<TestUserRole>{
		public TestUserRole mapRow(ResultSet rs, int rowNumber) throws SQLException {
			TestUserRole x = new TestUserRole();
			x.setgId(rs.getInt("g_id"));
			x.setAcctId(rs.getLong("acct_id"));
			x.setRoleId(rs.getInt("role_id"));
			
            return x;
		}		
	}

}

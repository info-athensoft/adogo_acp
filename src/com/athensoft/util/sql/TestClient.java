package com.athensoft.util.sql;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.athensoft.util.sql.QueryExpression;

public class TestClient {
		public static void main(String[] args) {
			Query q = new Query();
			q.add(QueryExpression.create("biz_id",QueryOperator.EQUAL_TO,"biz_id",123456L,Long.TYPE))
			 .add(QueryExpression.create("biz_name",QueryOperator.GREATER_THAN,"biz_name","Athensoft",String.class));
			
			//System.out.println(q.size());
			
			System.out.println(q.toSQLString());
			
			
			//output:  "and biz_id = :biz_id"		
			MapSqlParameterSource paramSource = new MapSqlParameterSource();
					
			for(QueryExpression qe: q.getQueryEntryList()){
				//System.out.println(qe.getAndString());
				//System.out.println(qe.getOrString());
				paramSource.addValue(qe.getArgValueName(), qe.getArgValue(qe.getArgType()));
				System.out.println(qe.getArgValueName()+"->"+qe.getArgValue(qe.getArgType()));
			}
		}
}

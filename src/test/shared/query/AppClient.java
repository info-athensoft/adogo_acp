package test.shared.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import test.shared.query.v1.QueryEntry;

public class AppClient {
	public static void main(String[] args){
		QueryClause qry = new QueryClause();
		
		//
		Map<String,String> orderSequece = new TreeMap<String,String>();
		orderSequece.put("biz_id", Query.ORDER_ASC);
		orderSequece.put("post_date", Query.ORDER_DESC);
		orderSequece.put("view_num", Query.ORDER_DESC);
		String orderbyStr = qry.orderBy(orderSequece);
		System.out.println(orderbyStr);
		
		//
		String andString = "biz_id=:biz_id";
		String andQueryString = qry.and(andString);
		System.out.println(andQueryString);
		
		//
		String orString = "biz_id=:biz_id";
		String orQueryString = qry.or(orString);
		System.out.println(orQueryString);
		
		//
		QueryEntry qryEntry1 = new QueryEntry("biz_id", 12345, Integer.TYPE, QueryOperator.GREATER_THAN);
		QueryEntry qryEntry2 = new QueryEntry("biz_name", "Biz Inc", String.class);
		QueryEntry qryEntry3 = new QueryEntry("biz_score", 9.5, Double.TYPE);
		
//		System.out.println(qryEntry1);
//		System.out.println(qryEntry2);
		
		List<QueryEntry> listQueryEntry = new ArrayList<QueryEntry>();
		listQueryEntry.add(qryEntry1);
		listQueryEntry.add(qryEntry2);
		listQueryEntry.add(qryEntry3);
		
		
		//output:  "and biz_id = :biz_id"		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
				
		for(QueryEntry qe: listQueryEntry){
			//System.out.println(qe.getAndString());
			//System.out.println(qe.getOrString());
			paramSource.addValue(qe.getArgName(), qe.getArgValue(qe.getArgType()));
			System.out.println(qe.getArgValue(qe.getArgType()));
		}
	}
}

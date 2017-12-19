package com.athensoft.util.sql;

import java.util.ArrayList;
import java.util.List;

public class Query {
	private List<QueryExpression> queryEntryList = new ArrayList<QueryExpression>();
	
	public Query add(QueryExpression qe){
		this.queryEntryList.add(qe);
		return this;
	}
	
	public Query remove(QueryExpression qe){
		this.queryEntryList.remove(qe);
		return this;
	}
	
	public int size(){
		return this.queryEntryList.size();
	}
	

	public List<QueryExpression> getQueryEntryList() {
		return queryEntryList;
	}

	public void setQueryList(List<QueryExpression> queryEntryList) {
		this.queryEntryList = queryEntryList;
	}
	
	public String toSQLString(){
		StringBuffer sbf = new StringBuffer();
		for(QueryExpression qryEntry: queryEntryList){
			sbf.append(qryEntry.and());
		}
		return sbf.toString();
	}
	
}

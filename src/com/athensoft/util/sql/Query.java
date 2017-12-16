package com.athensoft.util.sql;

import java.util.ArrayList;
import java.util.List;

public class Query {
	private List<QueryEntry> queryList = new ArrayList<QueryEntry>();
	
	public Query add(QueryEntry qe){
		this.queryList.add(qe);
		return this;
	}
	
	public Query remove(QueryEntry qe){
		this.queryList.remove(qe);
		return this;
	}
	
	public int size(){
		return this.queryList.size();
	}
	

	public List<QueryEntry> getQueryList() {
		return queryList;
	}

	public void setQueryList(List<QueryEntry> queryList) {
		this.queryList = queryList;
	}
	
	
	//TODO
	public static void main(String[] args) {
		Query q = new Query();
		q.add(new QueryEntry()).add(new QueryEntry());
		
		System.out.println(q.size());
	}
}

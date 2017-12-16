package test.shared.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class QueryEntry {
	
	private static final String EQUAL_TO 		= "=";
	private static final String NOT_EQUAL_TO	= "!=";
	private static final String GREATER_THAN	= ">";
	private static final String LESS_THAN		= "<";
	private static final String NO_LESS_THAN	= ">=";
	private static final String NO_GREATER_THAN	= "<=";

	
	
	private String argName;
	private Object argValue;
	private Class<?> argType;
	private String operator;
	
	public QueryEntry(String argName, Object argValue, Class<?> argType, String operator) {
		this.argName = argName;
		this.argValue = argValue;
		this.argType = argType;
		this.operator = operator;
	}
	
	public QueryEntry(String argName, Object argValue, Class<?> argType) {
		this.argName = argName;
		this.argValue = argValue;
		this.argType = argType;
		this.operator = EQUAL_TO;
	}
	
	@Override
	public String toString() {
		return "QueryEntry [argName=" + argName + ", argValue=" + argValue + ", argType=" + argType + "]";
	}
	
	
	public String getAndString(){
		return " AND "+this.getArgName()+this.getOperator()+":"+this.getArgName();
	}
	
	public String getOrString(){
		return " OR "+this.getArgName()+this.getOperator()+":"+this.getArgName();
	}
	
	@SuppressWarnings("unchecked")
	public<T> T getArgValue(Class<T> type) {
		return (T)argValue;
	}
	
	
	public static void main(String[] args) {
		QueryEntry qryEntry1 = new QueryEntry("biz_id", 12345, Integer.TYPE, QueryEntry.GREATER_THAN);
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
		
		
		for(QueryEntry qry: listQueryEntry){
			System.out.println(qry.getAndString());
			System.out.println(qry.getOrString());
			paramSource.addValue(qry.getArgName(), qry.getArgValue(qry.argType));
			System.out.println(qry.getArgValue(qry.argType));
		}
		
		
	}


	public String getArgName() {
		return argName;
	}
	public void setArgName(String argName) {
		this.argName = argName;
	}
	
	public Object getArgValue() {
		return argValue;
	}
	
	public void setArgValue(Object argValue) {
		this.argValue = argValue;
	}
	public Class<?> getArgType() {
		return argType;
	}
	public void setArgType(Class<?> argType) {
		this.argType = argType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}

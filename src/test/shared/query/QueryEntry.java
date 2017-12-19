package test.shared.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class QueryEntry {
	
	private String fieldName;
	private String argValueName;
	private Object argValue;
	private Class<?> argType;
	private String operator;
	
	public QueryEntry(String fieldName, String argValueName, Object argValue, Class<?> argType, String operator) {
		this.fieldName = fieldName;
		this.argValueName = argValueName;
		this.argValue = argValue;
		this.argType = argType;
		this.operator = operator;
	}
	
	public QueryEntry(String fieldName, String argValueName, Object argValue, Class<?> argType) {
		this.fieldName = fieldName;
		this.argValueName = argValueName;
		this.argValue = argValue;
		this.argType = argType;
		this.operator = QueryOperator.EQUAL_TO;
	}
	
		
	public String and(){
		return " AND "+this.getFieldName()+this.getOperator()+":"+this.getArgValueName();
	}
	
	public String or(){
		return " OR "+this.getFieldName()+this.getOperator()+":"+this.getArgValueName();
	}
	
	@SuppressWarnings("unchecked")
	public<T> T getArgValue(Class<T> type) {
		return (T)argValue;
	}
	
	public void setArgValue(Object argValue){
		this.argValue = argValue;
	}
	
	
	public static void main(String[] args) {
		QueryEntry qryEntry1 = new QueryEntry("biz_id", "bizId",12345, Integer.TYPE, QueryOperator.GREATER_THAN);
		QueryEntry qryEntry2 = new QueryEntry("biz_name", "bizName","Biz Inc", String.class);
		QueryEntry qryEntry3 = new QueryEntry("biz_score", "bizScore",9.5, Double.TYPE);
		
//		System.out.println(qryEntry1);
//		System.out.println(qryEntry2);
		
		List<QueryEntry> listQueryEntry = new ArrayList<QueryEntry>();
		listQueryEntry.add(qryEntry1);
		listQueryEntry.add(qryEntry2);
		listQueryEntry.add(qryEntry3);
		
		
		//output:  "and biz_id = :biz_id"
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		
		for(QueryEntry qry: listQueryEntry){
			System.out.println(qry.and());
			System.out.println(qry.or());
			paramSource.addValue(qry.getArgValueName(), qry.getArgValue(qry.argType));
			System.out.println(qry.getArgValue(qry.argType));
		}
		
		
	}


	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getArgValueName() {
		return argValueName;
	}
	
	public void setArgValueName(String argValueName) {
		this.argValueName = argValueName;
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

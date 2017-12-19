package com.athensoft.util.sql;

public class QueryExpression extends AbstractSQLClause{
	private String fieldName;
	private String argValueName;
	private Object argValue;
	private Class<?> argType;
	private String operator;
	
		
	public QueryExpression(){		
	}
	
	private QueryExpression(String fieldName, String operator, String argValueName, Object argValue, Class<?> argType) {
		this.fieldName = fieldName;
		this.argValueName = argValueName;
		this.argValue = argValue;
		this.argType = argType;
		this.operator = operator;
	}
	
	public static QueryExpression create(String fieldName, String operator, String argValueName, Object argValue, Class<?> argType){
		return new QueryExpression(fieldName, operator, argValueName, argValue, argType);
	}
	
	
	public String getExprString(){
		return this.getFieldName()+this.getOperator()+":"+this.getArgValueName();
	}
	
	
	@Override	
	public String and(){
		return " AND "+this.getFieldName()+this.getOperator()+":"+this.getArgValueName();
	}
	
	@Override
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

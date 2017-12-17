package test.shared.query.v1;

import test.shared.query.QueryOperator;

public class QueryEntry {
	
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
		this.operator = QueryOperator.EQUAL_TO;
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

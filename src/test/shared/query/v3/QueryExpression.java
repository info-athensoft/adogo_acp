package test.shared.query.v3;

public class QueryExpression {
	protected String fieldName;
	protected String operator;
	
	public String toExprString(){
		return "";
	}
	
	public void printValuePair(){
	}
	
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}

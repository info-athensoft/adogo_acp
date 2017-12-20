package test.shared.query.v3;

public class QueryExpressionFOV1 extends QueryExpression{
	
	private String valueName;
	private Object value;
	private Class<?> valueType;
	
	public QueryExpressionFOV1(){
		super();
	}
	
	public QueryExpressionFOV1(String fieldName, String operator, String valueName, Object value, Class<?> valueType){
		super(fieldName,operator);
		this.valueName = valueName;
		this.value = value;
		this.valueType = valueType;
	}
	
	public String toExprString(){
		return this.getFieldName()+this.getOperator()+":"+this.getValueName();
	}
	
	public void printValuePair(){
		System.out.println("\t"+this.getValueName()+"->"+this.getValue());
	}
	

	public String getValueName() {
		return valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Class<?> getValueType() {
		return valueType;
	}

	public void setValueType(Class<?> valueType) {
		this.valueType = valueType;
	}
	
}

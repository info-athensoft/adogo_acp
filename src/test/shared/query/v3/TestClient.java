package test.shared.query.v3;

public class TestClient {
	public static void main(String[] args){
		testQueryExpression();
	}
	
	public static void testQueryExpression(){
		QueryExpressionFOV1 expr1 = new QueryExpressionFOV1();
		expr1.setFieldName("biz_id");
		expr1.setOperator("=");
		expr1.setValueName("biz_id");
		expr1.setValue(12345678L);
		expr1.setValueType(Long.TYPE);
		
		QueryExpression qe1 = expr1;
		
		System.out.println(qe1.toExprString());
		qe1.printValuePair();
	}
}

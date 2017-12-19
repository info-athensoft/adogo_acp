package test.shared.query.v3;

import java.util.Map;
import java.util.TreeMap;

public class TestClient {
	public static void main(String[] args){
		testQueryExpression();
		//testOrderbyClause();
		//testBrace();
	}
	
	public static void testQueryExpression(){
		QueryExpressionFOV1 expr1 = new QueryExpressionFOV1();
		expr1.setFieldName("biz_id");
		expr1.setOperator("=");
		expr1.setValueName("biz_id");
		expr1.setValue(12345678L);
		expr1.setValueType(Long.TYPE);
		
		QueryExpression qe1 = expr1;
		
		WhereClause whereClause = new WhereClause();
		System.out.println(whereClause.and(qe1).and(qe1).or(qe1).toSQL());
		qe1.printValuePair();
		
		Object a = new Integer(345);
		int a1 = expr1.castValue(a, Integer.TYPE);
		System.out.println(a1);
		
		Object b = "hello";
		String b1 = expr1.castValue(b, String.class);
		System.out.println(b1);
	}
	
	public static void testOrderbyClause(){
		OrderbyClause orderbyClause = new OrderbyClause();
		Map<String,String> orderSequeceMap = new TreeMap<String,String>();
		orderSequeceMap.put("biz_id", "");
		orderSequeceMap.put("biz_name", "");
		orderSequeceMap.put("biz_score", "DESC");
		String s = orderbyClause.orderBy(orderSequeceMap).toSQL();
		System.out.println(s);
	}
	
	public static void testBrace(){
		QueryExpressionFOV1 expr1 = new QueryExpressionFOV1();
		expr1.setFieldName("biz_id");
		expr1.setOperator("=");
		expr1.setValueName("biz_id");
		expr1.setValue(12345678L);
		expr1.setValueType(Long.TYPE);
		
		QueryExpression qe1 = expr1;
		
		WhereClause whereClause = new WhereClause();
		System.out.println(whereClause.and(qe1).and(qe1).brace(whereClause).or(qe1).toSQL());
	}
}

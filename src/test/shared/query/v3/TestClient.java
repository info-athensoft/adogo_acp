package test.shared.query.v3;

import java.util.Map;
import java.util.TreeMap;

public class TestClient {
	public static void main(String[] args){
		//testQueryExpression();
		//testOrderbyClause();
		//testBrace();
		testQuery();
	}
	
	public static void testQuery(){
		QueryExpressionFOV1 qe1 = new QueryExpressionFOV1();
		qe1.setFieldName("biz_id");
		qe1.setOperator("=");
		qe1.setValueName("biz_id");
		qe1.setValue(12345678L);
		qe1.setValueType(Long.TYPE);
		
		QueryExpressionFOV1 qe2 = new QueryExpressionFOV1("biz_name",QueryOperator.GREATER_THAN,"biz_name","Athensoft",String.class);
		
				
		WhereClause whereClause = new WhereClause();
		whereClause = whereClause.and(qe1).and(qe2);
		
		Query qry = new Query(whereClause);
		System.out.println(qry.getWhereSQL());
		
		OrderbyClause orderbyClause = new OrderbyClause();
		//orderbyClause.orderBy(Arrays.asList("biz_id","biz_name","biz_score"));
		
		Map<String,String> orderSequeceMap = new TreeMap<String,String>();
		orderSequeceMap.put("biz_name", QueryOrder.DESC);
		orderSequeceMap.put("biz_score", QueryOrder.DESC);
		orderbyClause.orderBy(orderSequeceMap);
		
		Query qry2 = new Query(whereClause, orderbyClause);
		System.out.println(qry2.getOrderbySQL());
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

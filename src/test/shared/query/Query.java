package test.shared.query;

import java.util.Map;

public interface Query {
	public static final String ORDER_ASC = "";
	public static final String ORDER_DESC = "DESC";
	
	public String and(String queryString);
	
	public String or(String queryString);
	
	public String orderBy(Map<String,String> orderSequence);

}

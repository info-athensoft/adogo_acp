package test.shared.query.v2;

import java.util.Map;

public interface SQLClause {
	public String and();
	public String and(String expr);
	
	public String or();
	public String or(String expr);
	
	public String orderBy(String expr);
	public String orderBy(Map<String,String> orderSequence);
	
}

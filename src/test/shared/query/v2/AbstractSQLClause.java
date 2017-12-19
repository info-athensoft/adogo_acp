package test.shared.query.v2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public abstract class AbstractSQLClause implements SQLClause {

	@Override
	public abstract String and();

	@Override
	public String and(String sqlExpr){
		return " AND "+sqlExpr;
	}
	
	@Override
	public abstract String or();

	@Override
	public String or(String sqlExpr){
		return " OR "+sqlExpr;
	}
	
	@Override
	public String orderBy(String sqlExpr){
		return " ORDER BY "+sqlExpr;
	}
	
	@Override
	public String orderBy(Map<String,String> orderSequece){
		Set<Entry<String,String>> orderSequeceSet = orderSequece.entrySet();
		Iterator<Entry<String,String>> it = orderSequeceSet.iterator();
		StringBuffer sbf = new StringBuffer();
		sbf.append(" ORDER BY");
		while(it.hasNext()){
			Entry<String,String> entry = it.next();
			sbf.append(" "+entry.getKey()+" "+entry.getValue()+",");
		}
		sbf = sbf.deleteCharAt(sbf.length()-1); 
		return sbf.toString();
	}

}

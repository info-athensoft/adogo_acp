package test.shared.query;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QueryClause extends AbstractQuery {
	public String and(String queryString){
		return " AND "+queryString;
	}
	
	public String or(String queryString){
		return " OR "+queryString;
	}
	
	public String orderBy(Map<String,String> orderSequece){
		Set<Entry<String,String>> orderSequeceSet = orderSequece.entrySet();
		Iterator<Entry<String,String>> it = orderSequeceSet.iterator();
		StringBuffer sbf = new StringBuffer();
		sbf.append(" ORDER BY");
		while(it.hasNext()){
			Entry<String,String> entry = it.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			sbf.append(" "+entry.getKey()+" "+entry.getValue()+",");
		}
		sbf = sbf.deleteCharAt(sbf.length()-1); 
		return sbf.toString();
	}
}

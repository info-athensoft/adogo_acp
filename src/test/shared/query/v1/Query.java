package test.shared.query.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * multiple criteria of query
 * @author Athens
 *
 */
public class Query {
	private List<String> argNameList = new ArrayList<String>();
	private List<Object> argValueList = new ArrayList<Object>();
	private List<Class<?>> argTypeList = new ArrayList<Class<?>>();
	public List<String> getArgNameList() {
		return argNameList;
	}
	public void setArgNameList(List<String> argNameList) {
		this.argNameList = argNameList;
	}
	public List<Object> getArgValueList() {
		return argValueList;
	}
	public void setArgValueList(List<Object> argValueList) {
		this.argValueList = argValueList;
	}
	public List<Class<?>> getArgTypeList() {
		return argTypeList;
	}
	public void setArgTypeList(List<Class<?>> argTypeList) {
		this.argTypeList = argTypeList;
	}
	
	
	
}

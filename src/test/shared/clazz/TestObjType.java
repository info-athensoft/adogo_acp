package test.shared.clazz;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestObjType {
	
	public static void main(String[] args) {
		
		TestObjType obj = new TestObjType();
		
		
		List<Object> value = new ArrayList<Object>();
		value.add("abc");
		value.add(new Integer(123));
		
		List<Class<?>> type = new ArrayList<Class<?>>();
		type.add(String.class);
		type.add(Integer.TYPE);
		
		

		
		//System.out.println(value.get(0));
		//System.out.println(value.get(1));
		
		
//		int a1 = obj.getVal("123",Integer.class);
//		Double a2 = obj.getVal("11.11", Double.class);
//		System.out.println(a1);
//		System.out.println(a2);
		
		
		
	}
	
	@SuppressWarnings("unused")
	private void foo(Class<?> cls) {
		/*
	    if (cls == String.class) {
	    	System.out.println("String");
	    }
	    else if (cls == int.class) {
	    	System.out.println("int");
	    }else{
	    	System.out.println("unknown");
	    }*/
		String s = "111";
		Object c = s;
		String s2 = (String)c;
		
		
		System.out.println(s2);
	}

	
	@SuppressWarnings("unchecked")
	public<T> T getVal(String val, Class<T> type) {  
        // 把val转换成type类型返回 比如说getVal("123",Integer.class) 返回一个123  
        T value = null;  
        String className = type.getSimpleName();  
        if (type == Integer.class) {  
            className = "Int";  
        }  
        String convertMethodName = "parse" + className;  
        try {  
            Method m = type.getMethod(convertMethodName, String.class);  
            value = (T)(m.invoke(null, val));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return value;  
    } 
	
	
}

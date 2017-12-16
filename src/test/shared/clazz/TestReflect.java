package test.shared.clazz;

import java.lang.reflect.Method;

public class TestReflect {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		try {
			Class<?> cls = Class.forName("test.athensoft.shared.TestReflect");
			Class<?> partypes[] = new Class[2];
			partypes[0] = Integer.TYPE;
			partypes[1] = Integer.TYPE;
			
			Method meth = cls.getMethod("add", partypes);
			TestReflect methobj = new TestReflect();
			
			//arguments
			Object arglist[] = new Object[2];
			arglist[0] = new Integer(37);
			arglist[1] = new Integer(47);
			
			//invoke
			Object retobj = meth.invoke(methobj, arglist);
			
			//result
			Integer retval = (Integer) retobj;
			System.out.println(retval.intValue());
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}

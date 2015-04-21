package kc.practice.beans;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("prop1","1st Property");
		map.put("prop2","2nd Property");
		TestBean bean = new TestBean();
		BeanUtils.populate(bean, map);
		System.out.println(bean.toString());
	}
}
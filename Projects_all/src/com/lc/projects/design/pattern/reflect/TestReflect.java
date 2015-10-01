package com.lc.projects.design.pattern.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
		UserBean userBean = new UserBean();
		userBean.setId(1);
		userBean.setName("name2");
		
		Class userCla = userBean.getClass();
		
		Method[] methods = userCla.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m  = methods[i];
			if(m.getName().startsWith("set")){
				if(m.getName().endsWith("Name")){
					System.out.println(m.getName());
					m.invoke(userBean, "method name");
				}
			}
		}
		
		System.out.println(userBean);
		
		
		Field[] fields = userCla.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			
			f.setAccessible(true);
			
			String fname = f.getName();
			String ftype = f.getType().toString();
			
			if(ftype.endsWith("int")){
				f.set(userBean, 123);
			}else if(ftype.endsWith("String")){
				f.set(userBean, "my name");
			}
			
		}
		System.out.println(userBean);
		
		//get the entity of a class 
		Class clazz1 = UserBean.class;
		Class clazz2 = Class.forName("com.lc.java.design.test.reflect.UserBean");
		Class clazz3 = userBean.getClass();
		System.out.println(clazz1 + " " + clazz2 + " " + clazz3);
		
	}
}

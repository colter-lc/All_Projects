package com.lc.projects.design.pattern.factory2.factory;

import com.lc.projects.design.pattern.factory2.entity.ICar;

public abstract class AbstractFactory {
	private static String TOP = "top";
	private static String MIDDLE = "middle";
	private static String LOW = "low";
	public abstract ICar create();
	
	public static AbstractFactory createFactory(String marks){
		AbstractFactory factory = null;
		if(marks.equals(TOP)){
			factory = new TopFactory();
		}else if(marks.equals(MIDDLE)){
			factory = new MiddleFactory();
		}else if(marks.equals(LOW)){
			factory = new LowFactory();
		}
		
		return factory;
	}
}

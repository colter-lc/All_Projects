package com.lc.projects.design.pattern.factory2;

import com.lc.projects.design.pattern.factory2.entity.ICar;
import com.lc.projects.design.pattern.factory2.factory.AbstractFactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.createFactory("low");
		ICar car = factory.create();
		System.out.println(car.getClass());
	}
}

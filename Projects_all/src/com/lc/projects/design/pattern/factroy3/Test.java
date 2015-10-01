
package com.lc.projects.design.pattern.factroy3;

import com.lc.projects.design.pattern.factroy3.entity.ICar;
import com.lc.projects.design.pattern.factroy3.factory.TopFactory;

public class Test {
	public static void main(String[] args) {
		TopFactory factory = new TopFactory();
		ICar  car = ((TopFactory)factory).createCar();
		System.out.println(car.getClass());
	}
}

package com.lc.projects.design.pattern.factory2.factory;

import com.lc.projects.design.pattern.factory2.entity.ICar;
import com.lc.projects.design.pattern.factory2.entity.TopCar;

public class TopFactory extends AbstractFactory{

	@Override
	public ICar create() {
		return new TopCar();
	}

}

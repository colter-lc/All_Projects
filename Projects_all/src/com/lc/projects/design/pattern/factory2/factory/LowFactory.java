package com.lc.projects.design.pattern.factory2.factory;

import com.lc.projects.design.pattern.factory2.entity.ICar;
import com.lc.projects.design.pattern.factory2.entity.LowCar;

public class LowFactory extends AbstractFactory {

	@Override
	public ICar create() {
		return new LowCar();
	}

}

package com.lc.projects.design.pattern.factroy3.factory;

import com.lc.projects.design.pattern.factroy3.entity.ICar;
import com.lc.projects.design.pattern.factroy3.entity.LowCar;

public class LowFactory extends AbstractFactory2{

	@Override
	public ICar createCar() {
		return new LowCar();
	}

}

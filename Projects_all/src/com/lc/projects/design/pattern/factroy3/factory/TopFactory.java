package com.lc.projects.design.pattern.factroy3.factory;

import com.lc.projects.design.pattern.factroy3.entity.IBus;
import com.lc.projects.design.pattern.factroy3.entity.ICar;
import com.lc.projects.design.pattern.factroy3.entity.TopBus;
import com.lc.projects.design.pattern.factroy3.entity.TopCar;

public class TopFactory extends AbstractFactory1 {

	@Override
	public ICar createCar() {
		return new TopCar();
	}

	@Override
	public IBus createBus() {
		return new TopBus()
		;
	}
	
}

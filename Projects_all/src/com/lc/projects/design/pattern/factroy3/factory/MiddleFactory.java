package com.lc.projects.design.pattern.factroy3.factory;

import com.lc.projects.design.pattern.factroy3.entity.IBus;
import com.lc.projects.design.pattern.factroy3.entity.ICar;
import com.lc.projects.design.pattern.factroy3.entity.MiddleBus;
import com.lc.projects.design.pattern.factroy3.entity.MiddleCar;

public class MiddleFactory extends AbstractFactory1 {

	@Override
	public ICar createCar() {
		return new MiddleCar();
	}

	@Override
	public IBus createBus() {
		return new MiddleBus();
	}

}
